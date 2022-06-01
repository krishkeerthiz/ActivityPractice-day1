package com.example.activitypractice

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.d(TAG, "onStart: ")
        super.onStart()
      //  setContentView(R.layout.activity_main_2)
    }

    override fun onResume() {
        Log.d(TAG, "onResume: ")
        super.onResume()

    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: ")
        super.onRestart()
        setContentView(R.layout.activity_main_2)
    }

    override fun onPause() {
        Log.d(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: ")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ")
        super.onDestroy()
    }


}