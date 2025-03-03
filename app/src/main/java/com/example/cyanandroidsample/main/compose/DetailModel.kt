package com.example.cyanandroidsample.main.compose

import kotlinx.serialization.Serializable

@Serializable
data class DetailModel(
    val id: Int,
    val name: String,
    val email: String,
)
