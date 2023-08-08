package com.flyview.freecocktailbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.defaultComponentContext
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.core.koin
import com.flyview.freecocktailbar.root.createRootComponent
import com.flyview.freecocktailbar.root.ui.RootContent
import com.flyview.freecocktailbar.ui.theme.FreeCocktailBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val componentFactory = application.koin.get<ComponentFactory>()
        val rootComponent = componentFactory.createRootComponent(defaultComponentContext())

        setContent {
            FreeCocktailBarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootContent(
                        component = rootComponent,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}