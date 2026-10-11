package com.ludorewards.app.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(nav: NavController) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Ludo Rewards", style=MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(20.dp))
        Card(Modifier.fillMaxWidth().padding(4.dp)) {
            Column(Modifier.padding(16.dp)) {
                Text("Coins: 1250")
                Button(onClick={nav.navigate("game")}) { Text("Play Ludo") }
            }
        }
        Spacer(Modifier.height(12.dp))
        Button(onClick={nav.navigate("store")}, modifier=Modifier.fillMaxWidth()) { Text("Store - Sunset Dice, Forest Board") }
    }
}
