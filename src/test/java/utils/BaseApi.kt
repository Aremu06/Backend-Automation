package utils

open class BaseApi {

    companion object {
        @JvmStatic
        val dataFactory = DataFactory.INSTANCE

        @JvmStatic
        fun getEnvironmentVariables(variable: String?): String {
            return System.getenv(variable)
        }
    }
}