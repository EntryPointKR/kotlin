// !LANGUAGE: +GenerateNullChecksForGenericTypeReturningFunctions
// TARGET_BACKEND: JVM
// WITH_RUNTIME

@file:UseExperimental(JvmUnchecked::class)

import kotlin.experimental.JvmUnchecked

fun <T> bar() = fun(): @JvmUnchecked T = null as T

fun box(): String {
    try {
        bar<String>()()
    } catch (e: KotlinNullPointerException) {
        return "Fail: KotlinNullPointerException should have been thrown"
    }
    return "OK"
}
