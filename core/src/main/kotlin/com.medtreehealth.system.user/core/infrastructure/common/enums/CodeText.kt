package com.medtreehealth.system.user.core.infrastructure.common.enums

import java.io.Serializable


class CodeText : Serializable {
    /**
     * 对应id或者key
     */
    var code: Int = 0

    /**
     * 对应name或者value(showText)
     */
    var text: String? = null

    constructor() : super()

    internal constructor(code: Int, text: String) {
        this.code = code
        this.text = text
    }

    companion object {
        private const val serialVersionUID = -3515898042914020097L
    }

    override fun toString(): String {
        return "CodeText(code=$code, text=$text)"
    }
}
