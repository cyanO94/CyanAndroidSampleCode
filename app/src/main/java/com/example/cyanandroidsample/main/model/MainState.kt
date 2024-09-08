package com.example.cyanandroidsample.main.model

data class MainState(
    val isLoading: Boolean = false,
)

sealed class MainSideEffect {
    data class Toast(val text: String) : MainSideEffect()
}
