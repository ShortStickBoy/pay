package com.sunzn.pay.sample.wechat

import com.sunzn.pay.wechat.WXPayParams

/**
 * https://wxpay.wxutil.com/pub_v2/app/app_pay.php
 */
object ParamProxy {

    fun buildParam(): WXPayParams {
        val params = WXPayParams()
        params.appId = "wxb4ba3c02aa476ea1"
        params.partnerId = "1900006771"
        params.prepayId = "wx0516274059737847d6cc9b381221044132"
        params.packageValue = "Sign=WXPay"
        params.nonceStr = "bb2deafab7eac78b5024ff5dca657d98"
        params.timeStamp = "1572942460"
        params.sign = "7C901E8AC1AF5F93B3568F4F9C28D09D"
        return params
    }

}