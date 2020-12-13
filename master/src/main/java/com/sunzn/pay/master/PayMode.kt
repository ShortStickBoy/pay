package com.sunzn.pay.master

import android.app.Activity

interface PayMode<T : PayParams, A : Activity> {

    fun pay(activity: A, params: T, listener: PayListener)

}
