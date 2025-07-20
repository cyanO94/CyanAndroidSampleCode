package com.example.cyanandroidsample.main.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.cyanandroidsample.login.LoginScreen
import com.example.cyanandroidsample.ui.theme.CyanAndroidSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CyanAndroidSampleTheme {
                LoginScreen()
            }
        }
    }
}
