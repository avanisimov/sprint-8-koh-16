package ru.yandex.practicum.sprint8koh16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val isTablet = resources.getBoolean(R.bool.is_tablet)
    }
}