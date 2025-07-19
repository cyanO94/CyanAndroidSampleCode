package com.example.cyanandroidsample.main.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cyanandroidsample.R
import com.example.cyanandroidsample.login.component.SocialButton
import com.example.cyanandroidsample.ui.theme.CyanAndroidSampleTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier =
            modifier
                .fillMaxSize()
                .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SocialButton(
                modifier = Modifier,
                text = "Login with KAKAO",
                isEnabled = true,
                imagePainter = painterResource(id = R.drawable.ic_kakao),
                textColor = Color.Black,
                backgroundColor = Color(0xFFFEE500),
                onClick = {},
            )

            SocialButton(
                text = "Login with Apple",
                isEnabled = true,
                imagePainter = painterResource(id = R.drawable.ic_kakao),
                textColor = Color.Black,
                backgroundColor = Color.White,
                borderColor = Color.Black,
                onClick = {},
            )
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    CyanAndroidSampleTheme {
        LoginScreen()
    }
}
