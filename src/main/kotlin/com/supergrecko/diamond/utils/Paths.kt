package com.supergrecko.diamond.utils

import java.io.File
import java.io.IOException
import java.nio.file.FileVisitResult
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes

inline fun <reified T : FilesystemPath> pathFromString(path: String): T {
    val p = File(path)

    return if (p.isFile)
        FilePath(p.toPath()) as T else
        DirectoryPath(p.toPath()) as T
}

fun listFilesRecursive(directory: DirectoryPath): List<Path> {
    val files = mutableListOf<Path>()

    Files.walkFileTree(directory.absolute, object : FileVisitor<Path> {
        override fun postVisitDirectory(a: Path?, b: IOException?) = FileVisitResult.CONTINUE
        override fun visitFileFailed(a: Path?, b: IOException?) = FileVisitResult.CONTINUE
        override fun preVisitDirectory(a: Path?, b: BasicFileAttributes?) = FileVisitResult.CONTINUE

        override fun visitFile(path: Path?, attr: BasicFileAttributes?): FileVisitResult {
            if (path!!.toString().endsWith(".dm")) {
                files.add(path)
            }

            return FileVisitResult.CONTINUE
        }
    })

    return files
}
