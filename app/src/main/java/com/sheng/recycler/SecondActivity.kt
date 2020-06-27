package com.sheng.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }


    override fun onPause() {
        super.onPause()

        Log.e("Life","second onPause")
    }


    override fun onStop() {
        super.onStop()

        Log.e("Life","second onStop")
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.e("Life","second onDestroy")
    }
}
