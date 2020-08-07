package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvcourses.layoutManager = LinearLayoutManager(baseContext)

        val courseadapter =(listOf <String>
            ("courseId","courseName","courseCode","Instructer","Description"))
        rvcourses.adapter = "courseadapter"
val courseId=(listof(String())
        val coursename=(listof(String())
        val coursecode=(listof(String())
        val instructor=(listof(String())
        val description=(listof(String())
    }

}