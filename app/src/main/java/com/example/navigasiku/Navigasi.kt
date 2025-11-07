package com.example.navigasiku

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(navController: NavHostController = rememberNavController()
){}