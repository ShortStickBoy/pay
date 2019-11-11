package com.sunzn.pay.wechat

import com.sunzn.pay.master.PayParams
import com.sunzn.pay.master.PayValues

data class WXPayParams(
    var appId: String = PayValues.EMPTY,
    var partnerId: String = PayValues.EMPTY,
    var prepayId: String = PayValues.EMPTY,
    var packageValue: String = PayValues.EMPTY,
    var nonceStr: String = PayValues.EMPTY,
    var timeStamp: String = PayValues.EMPTY,
    var sign: String = PayValues.EMPTY
) : PayParams