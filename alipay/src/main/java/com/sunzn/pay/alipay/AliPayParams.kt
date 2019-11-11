package com.sunzn.pay.alipay

import com.sunzn.pay.master.PayParams
import com.sunzn.pay.master.PayValues

data class AliPayParams(val orderInfo: String? = PayValues.EMPTY) : PayParams
