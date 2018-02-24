package com.ylz.tool.Toast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.myapplication.R

/**
 * Created by yulizhou on 2018/2/10/010.
 */
class ToastTool(val context: Context) {


    fun makePopularToast(content: String) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
    }

    fun makeCustomToast(view: View) {
        PicToast.showToast(context, view)
    }

    fun makePicToast(leftId: Int, rightId: Int, topId: Int, bottomId: Int, str: String) {
        val rootView = LayoutInflater.from(context).inflate(R.layout.toast_pic, null)
        val left = rootView.findViewById<LinearLayout>(R.id.ly_left)
        val right = rootView.findViewById<LinearLayout>(R.id.ly_right)
        val top = rootView.findViewById<LinearLayout>(R.id.ly_top)
        val bottom = rootView.findViewById<LinearLayout>(R.id.ly_bottom)
        val message = rootView.findViewById<TextView>(R.id.message)
        message.text = str
        left.addView(createImageView(leftId))
        right.addView(createImageView(rightId))
        top.addView(createImageView(topId))
        bottom.addView(createImageView(bottomId))
        makeCustomToast(rootView)
    }

    fun createImageView(id: Int): ImageView {
        val imageView = ImageView(context)
        if (id != null && id != 0) {
            imageView.setLayoutParams(ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))  //设置图片宽高
            Glide.with(context)
                    .load(id)
                    .into(imageView)
            return imageView
        }
        return imageView
    }


}