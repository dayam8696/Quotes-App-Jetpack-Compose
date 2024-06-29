package com.example.quotes_app_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.quotes_app_jetpack_compose.screens.QuoteDetail
import com.example.quotes_app_jetpack_compose.screens.QuoteListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            DataManager.loadAssetsFromFile(applicationContext)
        }

        enableEdgeToEdge()
        setContent {
            App()
        }
    }
    @Composable
    fun App(){
        if (DataManager.isDataLoaded.value){
            if (DataManager.currentPage.value==Pages.LISTING){
            QuoteListScreen(data = DataManager.data) {
                DataManager.switchPages(it)
            }

            }
            else{
                DataManager.currentQuote?.let { QuoteDetail(quote = it) }
            }

        }

    }
}

enum class Pages{
    LISTING,
    DEATLS
}

