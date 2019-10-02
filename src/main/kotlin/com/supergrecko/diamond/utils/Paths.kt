package com.supergrecko.diamond.utils

import java.nio.file.Path

interface FilesystemPath {
    val path: Path

    fun create(): Boolean
    fun delete(): Boolean
    fun exists(): Boolean
}

data class FilePath(override val path: Path) : FilesystemPath {
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
