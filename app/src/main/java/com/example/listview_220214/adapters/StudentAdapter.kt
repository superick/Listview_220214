package com.example.listview_220214.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview_220214.R
import com.example.listview_220214.datas.Student
import java.util.*

class StudentAdapter(
        val mContext : Context,
        val resId : Int,
        val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList){

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)

        }

        val row = tempRow!!

        return row

    }



        }