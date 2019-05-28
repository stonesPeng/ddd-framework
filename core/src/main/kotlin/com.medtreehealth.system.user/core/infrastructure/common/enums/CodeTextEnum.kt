package com.medtreehealth.system.user.core.infrastructure.common.enums


interface CodeTextEnum : CodeEnum {

    /**
     * Get the text of the enum object
     *
     * @return the text
     */
    fun text(): String

    companion object {
        /**
         * Convert CodeEnum to CodeText object
         *
         * @param enumClass Enum class
         * @param <T>       Generic type
         * @return CodeText object
        </T> */
        fun <T> enumToList(enumClass: Class<T>): ArrayList<CodeText> where T : CodeTextEnum {
            return enumClass.enumConstants.map {
                e->
                CodeText(code = e.code(), text = e.text())
            }.toCollection(ArrayList())
        }
    }
}
