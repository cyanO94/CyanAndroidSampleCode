package com.example.cyanandroidsample.main.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.cyanandroidsample.R
import com.example.cyanandroidsample.login.component.SocialButton

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginEvent: () -> Unit,
) {
    Box(
        modifier =
            modifier
                .fillMaxSize()
                .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        SocialButton(
            modifier = Modifier,
            text = "Login with KAKAO",
            isEnabled = true,
            imagePainter = painterResource(id = R.drawable.ic_kakao),
            textColor = Color.Black,
            backgroundColor = Color(0xFFFEE500),
            onClick = onLoginEvent,
        )
    }
}
