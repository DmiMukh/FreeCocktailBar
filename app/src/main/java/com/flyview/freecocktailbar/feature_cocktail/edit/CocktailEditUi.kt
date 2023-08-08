package com.flyview.freecocktailbar.feature_cocktail.edit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.flyview.freecocktailbar.ui.theme.FreeCocktailBarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CocktailEditUi(component: CocktailEditComponent) {

    val recipeName = component.name.collectAsState()
    val recipeDescription = component.description.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->

        Column (
            modifier = Modifier.padding(paddingValues)
        ){
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = recipeName.value,
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    label = { Text("Title") }
                )

                OutlinedTextField(
                    value = recipeDescription.value,
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    label = { Text("Description") }
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = component::onSaveClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(text = "Save")
                }

                OutlinedButton(
                    onClick = component::onCancelClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(text = "Cancel")
                }
            }
        }
    }
}

@Composable
fun RecipeEditUiPreview(darkTheme: Boolean) {
    FreeCocktailBarTheme(darkTheme = darkTheme) {
        CocktailEditUi(component = FakeCocktailEditComponent())
    }
}

@Preview(name = "light")
@Composable
fun RecipeEditUiPreviewLight() {
    RecipeEditUiPreview(darkTheme = false)
}

@Preview(name = "dark")
@Composable
fun RecipeEditUiPreviewDark() {
    RecipeEditUiPreview(darkTheme = true)
}