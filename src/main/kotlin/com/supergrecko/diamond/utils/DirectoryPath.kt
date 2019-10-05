package com.supergrecko.diamond.utils

import java.nio.file.Path

/**
 * @property path
 * @property absolute
 */
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
