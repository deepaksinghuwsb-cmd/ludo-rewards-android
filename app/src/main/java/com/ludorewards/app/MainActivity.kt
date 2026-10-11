package com.ludorewards.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.*
import com.ludorewards.app.ui.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val nav = rememberNavController()
                NavHost(navController = nav, startDestination = "login") {
                    composable("login") { LoginScreen(nav) }
                    composable("home") { HomeScreen(nav) }
                    composable("game") { GameBoardScreen(nav) }
                    composable("store") { StoreScreen(nav) }
                }
            }
        }
    }
}
