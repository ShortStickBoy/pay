package com.sunzn.pay.sample.alipay

object OrderProxy {

    private const val APP_ID = ""
    private const val RSA2_PRIVATE = "";

    fun buildOrder(): String {
        val params: Map<String, String> = OrderInfoUtil2_0.buildOrderParamMap(APP_ID, true)
        val orderParam: String = OrderInfoUtil2_0.buildOrderParam(params)
        val sign: String = OrderInfoUtil2_0.getSign(params, RSA2_PRIVATE, true)
        return "$orderParam&$sign"
    }

}