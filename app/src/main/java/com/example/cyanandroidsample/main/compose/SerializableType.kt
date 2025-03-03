package com.example.cyanandroidsample.main.compose

import android.os.Bundle
import androidx.navigation.NavType
import kotlinx.serialization.json.Json

inline fun <reified T : Any> serializableType(isNullableAllowed: Boolean = false) =
    object : NavType<T>(isNullableAllowed = isNullableAllowed) {
        override fun get(
            bundle: Bundle,
            key: String,
        ) = bundle.getString(key)?.let<String, T>(Json::decodeFromString)

        override fun parseValue(value: String): T = Json.decodeFromString(value)

        override fun serializeAsValue(value: T): String = Json.encodeToString(value)

        override fun put(
            bundle: Bundle,
            key: String,
            value: T,
        ) {
            bundle.putString(key, Json.encodeToString(value))
        }
    }
