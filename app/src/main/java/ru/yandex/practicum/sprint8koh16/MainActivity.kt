package ru.yandex.practicum.sprint8koh16

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SPRINT_8", "$this onCreate savedInstanceState=$savedInstanceState")
        setContentView(R.layout.activity_main)
        val isTablet = resources.getBoolean(R.bool.is_tablet)
        resources.configuration
        theme
    }

    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "$this onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "$this onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "$this onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "$this onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "$this onDestroy")
    }
}