package com.sunzn.pay.wechat

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.tencent.mm.opensdk.constants.ConstantsAPI
import com.tencent.mm.opensdk.modelbase.BaseReq
import com.tencent.mm.opensdk.modelbase.BaseResp
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler

open class WXPayActivity : Activity(), IWXAPIEventHandler {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WXPay.instance.getWXAPI().handleIntent(intent, this)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
        WXPay.instance.getWXAPI().handleIntent(intent, this)
    }

    override fun onResp(baseResp: BaseResp?) {
        if (baseResp?.type == ConstantsAPI.COMMAND_PAY_BY_WX) {
            WXPay.instance.onResp(baseResp.errCode, baseResp.errStr)
            finish()
        }
    }

    override fun onReq(baseReq: BaseReq?) {
        // TODO
    }

}