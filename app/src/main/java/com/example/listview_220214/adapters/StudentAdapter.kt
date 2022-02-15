package com.example.listview_220214.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listview_220214.datas.Student
import java.util.*

class StudentAdapter(
        val mContext : Context,
        val resId : Int,
        val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}