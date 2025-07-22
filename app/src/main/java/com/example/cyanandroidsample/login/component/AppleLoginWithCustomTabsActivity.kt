package com.example.cyanandroidsample.login.component

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.browser.customtabs.CustomTabsIntent
import java.security.SecureRandom
import java.util.Base64

class AppleLoginWithCustomTabsActivity: ComponentActivity() {

    private var currentState: String? = null

    private val clientId = "YOUR_CLIENT_ID"
    private val redirectUri = "YOUR_REDIRECT_URI"

    companion object {
        private const val TAG = "AppleLogin"
        private const val STATE_KEY = "apple_login_state"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        currentState = savedInstanceState?.getString(STATE_KEY) ?: generateState()
        val appleAuthUri = Uri.Builder()
            .scheme("https")
            .authority("appleid.apple.com")
            .appendPath("auth")
            .appendPath("authorize")
            .appendQueryParameter("response_mode", "form_post")
            .appendQueryParameter("response_type", "code id_token")
            .appendQueryParameter("client_id", clientId)
            .appendQueryParameter("redirect_uri", redirectUri)
            .appendQueryParameter("state", currentState)
            .build()

        val customTabsIntent = CustomTabsIntent.Builder().build()
        customTabsIntent.launchUrl(this, appleAuthUri)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_KEY, currentState)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        Log.d(TAG, "intent data : ${intent.data}")


        intent.data?.let { uri ->
            parseUri(uri)
        }
    }

    private fun parseUri(uri: Uri) {
        val token = uri.getQueryParameter("token")
        Log.d(TAG, "token : $token")

        finish()
    }

    private fun generateState(): String {
        val random = SecureRandom()
        val bytes = ByteArray(16)
        random.nextBytes(bytes)
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes)
    }
}