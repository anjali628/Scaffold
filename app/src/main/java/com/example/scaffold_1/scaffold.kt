package com.example.scaffold_1

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Scaf() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Scaffold_tutorial")
                },
                navigationIcon = {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                },
                actions = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        },
        bottomBar = {
            BottomAppBar() {
                Icon(imageVector = Icons.Default.Person, contentDescription = "")
                Icon(imageVector = Icons.Default.Home, contentDescription = "")
            }
        }
    ) {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "")
    }



}