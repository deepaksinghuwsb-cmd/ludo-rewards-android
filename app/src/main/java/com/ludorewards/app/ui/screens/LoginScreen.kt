package com.ludorewards.app.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LoginScreen(nav: NavController) {
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    Column(Modifier.fillMaxSize().padding(24.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Welcome Back!", style = MaterialTheme.typography.headlineLarge)
        Spacer(Modifier.height(20.dp))
        OutlinedTextField(value=email, onValueChange={email=it}, label={Text("Email")}, modifier=Modifier.fillMaxWidth())
        Spacer(Modifier.height(12.dp))
        OutlinedTextField(value=pass, onValueChange={pass=it}, label={Text("Password")}, modifier=Modifier.fillMaxWidth())
        Spacer(Modifier.height(20.dp))
        Button(onClick={nav.navigate("home")}, modifier=Modifier.fillMaxWidth()) { Text("Sign In") }
    }
}
