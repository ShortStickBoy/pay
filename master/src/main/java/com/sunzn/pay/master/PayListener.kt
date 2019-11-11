package com.sunzn.pay.master

interface PayListener {

    fun onSuccess()

    fun onFailure(errCode: String?, errText: String?)

    fun onCancel()

}
