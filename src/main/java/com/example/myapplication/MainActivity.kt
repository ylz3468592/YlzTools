package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.ylz.tool.Toast.ToastTool

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toast1(view: View){
        ToastTool(this).makePicToast(R.mipmap.timg,0,android.R.drawable.btn_star_big_on,android.R.drawable.btn_star_big_on,"----------!!------")
//        ToastTool(this).makePicToast(android.R.drawable.btn_star_big_on,0,0,0,"------------")
    }
}
