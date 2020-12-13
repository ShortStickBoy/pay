package com.sunzn.pay.master

import android.app.Activity

object Consumer {

    fun <T : PayParams, A : Activity> pay(mode: PayMode<T, A>, activity: A, params: T, listener: PayListener) {
        mode.pay(activity, params, listener)
    }

}
