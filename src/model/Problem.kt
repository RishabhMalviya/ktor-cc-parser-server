package com.kotlincp.model


data class Problem(
    val name: String,
    val group: String,
    val url: String,
    val interactive: Boolean,
    val memoryLimit: Int, // in megabytes
    val timeLimit: Int, // in milliseconds
    val tests: List<TestCase>,
    val testType: String,
    val input: InputConfiguration,
    val output: OutputConfiguration,
    val languages: LanguageConfiguration
) {
    data class TestCase(val input: String, val output: String)

    data class InputConfiguration(val type: String, val fileName: String?, val pattern: String?)

    data class OutputConfiguration(val type: String, val fileName: String?)

    data class LanguageConfiguration(val java: JavaConfiguration) {
        data class JavaConfiguration(val mainClass: String, val taskClass: String)
    }
}