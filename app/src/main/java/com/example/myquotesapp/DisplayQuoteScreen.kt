package com.example.myquotesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DisplayQuoteScreen(navController: NavHostController) {
    Scaffold (
       topBar =  {
           TopAppBar(
               title = { Text("My Favourite Quotes") },
               colors = TopAppBarDefaults.topAppBarColors(
                   containerColor = Color(0xFF6200EE),
                   titleContentColor = Color.White
               )
           )
       },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("add")
            }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ){ padding ->
        Column (modifier = Modifier.padding(padding)
            .fillMaxSize().background(Color.White)
        ){  }

    }
}