package com.supergrecko.diamond.utils

import java.io.File
import java.io.IOException
import java.nio.file.FileVisitResult
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes

/**
 * Represent a file path in a file system
 *
 * @property path
 * @property absolute
 */
interface FilesystemPath {
    val path: Path
    val absolute: Path

    fun create(): Boolean
    fun delete(): Boolean
    fun exists(): Boolean
}

data class FilePath(override val path: Path) : FilesystemPath {
    override val absolute = path.toAbsolutePath()

    override fun exists(): Boolean = path.toFile().exists()
    override fun create(): Boolean {
        return if (!exists())
            path.toFile().createNewFile() else
            false
    }

    override fun delete(): Boolean {
        return if (exists())
            path.toFile().delete() else
            false
    }
}

data class DirectoryPath(override val path: Path) : FilesystemPath {
    override val absolute = path.toAbsolutePath()

    override fun exists(): Boolean = path.toFile().exists()
    override fun create(): Boolean {
        return if (!exists())
            path.toFile().mkdir() else
            false
    }

    override fun delete(): Boolean {
        return if (exists())
            path.toFile().deleteRecursively() else
            false
    }

    fun toFileList(): List<FilePath> {
        val files = mutableListOf<FilePath>()

        Files.walkFileTree(absolute, object : FileVisitor<Path> {
            override fun postVisitDirectory(p0: Path?, p1: IOException?) = FileVisitResult.CONTINUE
            override fun visitFileFailed(p0: Path?, p1: IOException?) = FileVisitResult.CONTINUE
            override fun preVisitDirectory(p0: Path?, p1: BasicFileAttributes?) = FileVisitResult.CONTINUE

            override fun visitFile(path: Path?, attr: BasicFileAttributes?): FileVisitResult {
                if (path!!.endsWith(".dm")) {
                    files.add(FilePath(path))
                }

                return FileVisitResult.CONTINUE
            }
        })

        return files
    }
}

inline fun <reified T : FilesystemPath> pathFromString(path: String): T {
    val p = File(path)

    return if (p.isFile)
        FilePath(p.toPath()) as T else
        DirectoryPath(p.toPath()) as T
}
