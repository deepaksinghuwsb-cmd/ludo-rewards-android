package com.ludorewards.app.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class StoreItem(val name: String, val price: Int)

@Composable
fun StoreScreen(nav: NavController) {
    val items = listOf(StoreItem("Sunset Dice", 500), StoreItem("Forest Board", 800), StoreItem("Royal Board", 1200), StoreItem("Golden Token", 300))
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Store - No Funding Packages, All Coins", style=MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(12.dp))
        LazyColumn {
            items(items) { item ->
                Card(Modifier.fillMaxWidth().padding(6.dp)) {
                    Row(Modifier.fillMaxWidth().padding(16.dp), horizontalArrangement=Arrangement.SpaceBetween) {
                        Text(item.name)
                        Button(onClick={}) { Text("\ coins") }
                    }
                }
            }
        }
        Spacer(Modifier.height(12.dp))
        Button(onClick={nav.popBackStack()}, modifier=Modifier.fillMaxWidth()) { Text("Back") }
    }
}
