package com.ylz.tool.Toast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R


/**
 * Created by Administrator on 2018/2/10/010.
 */
object PicToast {

    fun showToast(context: Context,toastRoot: View) {
        //Toast的初始化
        val toastStart = Toast(context)
        //获取屏幕高度
        val wm: WindowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val height = wm.getDefaultDisplay().getHeight()
        //Toast的Y坐标是屏幕高度的1/3，不会出现不适配的问题
        toastStart.setGravity(Gravity.TOP, 0, height / 3)
        toastStart.setDuration(Toast.LENGTH_LONG)
        toastStart.setView(toastRoot)
        toastStart.show()
    }


}