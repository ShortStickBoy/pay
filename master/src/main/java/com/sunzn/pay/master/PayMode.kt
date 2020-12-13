package com.sunzn.pay.master

import android.app.Activity

interface PayMode<T : PayParams> {

    fun pay(activity: Activity, params: T, listener: PayListener)

}
