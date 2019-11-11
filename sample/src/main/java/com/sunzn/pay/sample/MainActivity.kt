package com.sunzn.pay.sample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sunzn.pay.alipay.AliPay
import com.sunzn.pay.alipay.AliPayParams
import com.sunzn.pay.master.Consumer
import com.sunzn.pay.master.PayListener
import com.sunzn.pay.sample.alipay.OrderProxy
import com.sunzn.pay.sample.wechat.ParamProxy
import com.sunzn.pay.wechat.WXPay
import com.sunzn.pay.wechat.WXPayParams

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn_alipay).setOnClickListener { alipay() }
        findViewById<View>(R.id.btn_wechat).setOnClickListener { wechat() }
    }

    private fun alipay() {
        val aliPay = AliPay()
        val params = AliPayParams(OrderProxy.buildOrder())
        Consumer.pay(aliPay, this, params, object : PayListener {
            override fun onSuccess() {
                Toast.makeText(this@MainActivity, "成功", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(errCode: String?, errText: String?) {
                Toast.makeText(this@MainActivity, errText, Toast.LENGTH_SHORT).show()
            }

            override fun onCancel() {
                Toast.makeText(this@MainActivity, "取消", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun wechat() {
        val wxPay: WXPay = WXPay.instance
        val params: WXPayParams = ParamProxy.buildParam()
        Consumer.pay(wxPay, this, params, object : PayListener {
            override fun onSuccess() {
                Toast.makeText(this@MainActivity, "成功", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(errCode: String?, errText: String?) {
                Toast.makeText(this@MainActivity, errText, Toast.LENGTH_SHORT).show()
            }

            override fun onCancel() {
                Toast.makeText(this@MainActivity, "取消", Toast.LENGTH_SHORT).show()
            }
        })
    }

}
