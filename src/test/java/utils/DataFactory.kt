package utils

import utils.BaseApi.Companion.getEnvironmentVariables
import java.util.*

class DataFactory private constructor() {

    private var rb: ResourceBundle? = null
    var STAGING_BASE_PATH: String? = null
    var STAGING_ACCESS_TOKEN: String? = null

    init {
        try {
            rb = ResourceBundle.getBundle("env")
        } catch (e: Exception) {
            rb = null
            println("Did not find env file.")
        }
        if (rb == null) {
            STAGING_BASE_PATH = getEnvironmentVariables("STAGING_BASE_PATH")
            STAGING_ACCESS_TOKEN = getEnvironmentVariables("STAGING_ACCESS_TOKEN")
        } else {
            STAGING_BASE_PATH = rb!!.getString("STAGING_BASE_PATH")
            STAGING_ACCESS_TOKEN = rb!!.getString("STAGING_ACCESS_TOKEN")
        }
        if (STAGING_BASE_PATH == null) throw NullPointerException("STAGING_BASE_PATH is null")
        if (STAGING_ACCESS_TOKEN == null) throw NullPointerException("STAGING_ACCESS_TOKEN is null")
    }

    companion object {
        val INSTANCE: DataFactory = DataFactory()
    }
}