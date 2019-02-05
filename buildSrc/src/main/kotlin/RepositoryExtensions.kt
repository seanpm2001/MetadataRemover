/*
 * MIT License
 *
 * Copyright (c) 2018 Jan Heinrich Reimer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

/**
 * jCenter repository
 */
inline val RepositoryHandler.jCenter
    get() = jcenter()

/**
 * Gradle plugin repository
 */
inline val RepositoryHandler.gradlePluginPortal
    get() = gradlePluginPortal()

/**
 * Maven Central repository
 */
inline val RepositoryHandler.mavenCentral
    get() = mavenCentral()

/**
 * Google Maven repository
 */
inline val RepositoryHandler.google
    get() = google()

/**
 * JitPack Maven repository
 */
inline val RepositoryHandler.jitPack
    get() = maven("https://jitpack.io")

/**
 * Adobe Maven repository
 */
inline val RepositoryHandler.adobe
    get() = maven("https://repo.adobe.com/nexus/content/repositories/public/")

/**
 * Adobe Maven repository
 */
inline val RepositoryHandler.sonatypeSnapshots
    get() = maven("https://oss.sonatype.org/content/repositories/snapshots/")