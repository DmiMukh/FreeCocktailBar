package com.flyview.freecocktailbar.feature_recipe.list

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.flyview.freecocktailbar.ui.theme.FreeCocktailBarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeListUi(component: RecipeListComponent) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = component::addRecipe) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add_recipe"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { paddingValues ->
    }
}

@Composable
fun RecipeListUiPreview(darkTheme: Boolean) {
    FreeCocktailBarTheme(darkTheme = darkTheme) {
        RecipeListUi(FakeRecipeListComponent())
    }
}

@Preview(name = "light")
@Composable
fun RecipeListUiPreviewLight() {
    RecipeListUiPreview(darkTheme = false)
}

@Preview(name = "dark")
@Composable
fun RecipeListUiPreviewDark() {
    RecipeListUiPreview(darkTheme = true)
}