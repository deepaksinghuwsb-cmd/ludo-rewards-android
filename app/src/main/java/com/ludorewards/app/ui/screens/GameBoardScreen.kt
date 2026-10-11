package com.ludorewards.app.ui.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlin.random.Random

@Composable
fun GameBoardScreen(nav: NavController) {
    var dice by remember { mutableStateOf(1) }
    var turn by remember { mutableStateOf("Red") }
    val colors = mapOf("Red" to Color(0xFFE53935), "Green" to Color(0xFF43A047), "Yellow" to Color(0xFFFDD835), "Blue" to Color(0xFF1E88E5))
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment=Alignment.CenterHorizontally) {
        Text("Ludo - \ Turn", style=MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(16.dp))
        Box(Modifier.size(320.dp).background(Color(0xFFFFF8E1), RoundedCornerShape(12.dp)), contentAlignment=Alignment.Center) {
            Column {
                Row {
                    Box(Modifier.size(120.dp).background(colors["Red"]!!))
                    Spacer(Modifier.width(80.dp))
                    Box(Modifier.size(120.dp).background(colors["Green"]!!))
                }
                Spacer(Modifier.height(80.dp))
                Row {
                    Box(Modifier.size(120.dp).background(colors["Yellow"]!!))
                    Spacer(Modifier.width(80.dp))
                    Box(Modifier.size(120.dp).background(colors["Blue"]!!))
                }
            }
            Box(Modifier.size(60.dp).background(Color.White, RoundedCornerShape(8.dp)), contentAlignment=Alignment.Center) {
                Text("\", style=MaterialTheme.typography.headlineMedium)
            }
        }
        Spacer(Modifier.height(20.dp))
        Button(onClick={ dice = Random.nextInt(1,7); val t = listOf("Red","Green","Yellow","Blue"); turn = t.random() }) { Text("Roll Dice - \") }
        Spacer(Modifier.height(12.dp))
        OutlinedButton(onClick={nav.popBackStack()}) { Text("Back to Home") }
    }
}
