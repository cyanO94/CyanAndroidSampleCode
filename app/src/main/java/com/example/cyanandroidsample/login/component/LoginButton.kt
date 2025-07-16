package com.example.cyanandroidsample.login.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cyanandroidsample.R
import com.example.cyanandroidsample.ext.WidthSpacer
import com.example.cyanandroidsample.ui.theme.CyanAndroidSampleTheme

@Composable
fun SocialButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean,
    imagePainter: Painter,
    textColor: Color,
    backgroundColor: Color,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        enabled = isEnabled,
        modifier =
            modifier
                .fillMaxWidth()
                .wrapContentHeight(),
        colors =
            ButtonDefaults.buttonColors(
                containerColor = backgroundColor,
                contentColor = textColor,
            ),
        shape = RoundedCornerShape(12.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(vertical = 16.dp),
        ) {
            Image(
                painter = imagePainter,
                contentDescription = "Button Icon",
            )
            WidthSpacer(16)

            Text(
                text = text,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun SocialButtonDisablePreview() {
    CyanAndroidSampleTheme {
        SocialButton(
            text = "카카오 로그인",
            isEnabled = true,
            backgroundColor = Color(0xFFFEE500),
            textColor = Color.Black,
            imagePainter = painterResource(R.drawable.ic_kakao),
            onClick = {},
        )
    }
}
