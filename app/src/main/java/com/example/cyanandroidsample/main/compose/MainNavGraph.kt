package com.example.cyanandroidsample.main.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.cyanandroidsample.main.compose.ui.DetailScreen
import com.example.cyanandroidsample.main.compose.ui.DetailWithNavTypeScreen
import com.example.cyanandroidsample.main.compose.ui.HomeScreen
import kotlin.reflect.typeOf

@Composable
fun MainNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: MainNavRoute = MainNavRoute.Home,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable<MainNavRoute.Home> {
            HomeScreen()
        }
        composable<MainNavRoute.Detail> {
            val id = it.toRoute<MainNavRoute.Detail>().id
            DetailScreen(
                id = id,
            )
        }
        composable<MainNavRoute.DetailWithNavType>(
            typeMap = mapOf(typeOf<DetailModel>() to serializableType<DetailModel>()),
        ) {
            val route = it.toRoute<MainNavRoute.DetailWithNavType>()
            DetailWithNavTypeScreen(
                detailModel = route.detailModel,
            )
        }
    }
}
