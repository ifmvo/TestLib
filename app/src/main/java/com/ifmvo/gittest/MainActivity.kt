package com.ifmvo.gittest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ifmvo.testlibrary.Utils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utils.add()
    }

}
