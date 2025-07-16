package com.example.cyanandroidsample.main.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.cyanandroidsample.ui.theme.CyanAndroidSampleTheme

class MainActivity : ComponentActivity() {
    private val vm: MainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CyanAndroidSampleTheme {
            }
        }
    }
}
