package com.ylly.signatureview

import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //清除签名
        clear.setOnClickListener {
            signature_view.clear()
        }
        //检查签名
        check.setOnClickListener {
            if (signature_view.isSign) {
                Toast.makeText(this, "已签名", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "未签名", Toast.LENGTH_SHORT).show()
            }
        }
        //保存签名(需动态获取存储权限)
        save.setOnClickListener {
            if (signature_view.isSign) {
                val path = AppContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES).toString() + "/" + System.currentTimeMillis() + "signature.jpg"
                signature_view.save(path)
                val options = BitmapFactory.Options()
                options.inSampleSize = 2
                val bitmap = BitmapFactory.decodeFile(path, options)
                signature_img.setImageBitmap(bitmap)
            } else {
                Toast.makeText(this, "未检测到签名", Toast.LENGTH_SHORT).show()
            }
        }
    }
}