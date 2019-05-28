package com.medtreehealth.system.user.core.infrastructure.common.enums


interface CodeEnum {

    /**
     * Get the code of the enum object
     *
     * @return the code
     */
    fun code(): Int

    companion object {
        /**
         * Get enum by code
         *
         * @param code      code
         * @param enumClass Enum class
         * @param <T>       Generic type
         * @return Enum object
        </T> */
        fun <T> valueOf(code: Int, enumClass: Class<T>): T where T : CodeEnum {
            return enumClass.enumConstants.first { e -> code == e.code() }
        }
    }
}

