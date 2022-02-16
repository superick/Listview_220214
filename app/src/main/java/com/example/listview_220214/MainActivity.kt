package com.example.listview_220214

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_220214.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("나는미니미", 1990 ))
        mStudentList.add( Student("오수진", 1995 ))
        mStudentList.add( Student("김삼순", 1997 ))
        mStudentList.add( Student("김말년", 1985 ))
        mStudentList.add( Student("이상택", 1990 ))
        mStudentList.add( Student("박아영", 1995 ))
        mStudentList.add( Student("이미진", 1998 ))



    }
}