package com.example.cyanandroidsample.main.compose

import kotlinx.serialization.Serializable

@Serializable
sealed interface MainNavRoute {
    @Serializable
    data object Home : MainNavRoute

    @Serializable
    data class Detail(val id: Int) : MainNavRoute

    @Serializable
    data class DetailWithNavType(val detailModel: DetailModel) : MainNavRoute
}
