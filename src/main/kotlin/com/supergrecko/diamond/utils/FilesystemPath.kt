package com.supergrecko.diamond.utils

import java.nio.file.Path

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
