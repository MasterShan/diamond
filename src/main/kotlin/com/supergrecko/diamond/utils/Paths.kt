package com.supergrecko.diamond.utils

import java.io.File
import java.nio.file.Path

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
}

fun pathFromString(path: String): FilesystemPath {
    val p = File(path)

    return if (p.isFile())
        FilePath(p.toPath()) else
        DirectoryPath(p.toPath())
}