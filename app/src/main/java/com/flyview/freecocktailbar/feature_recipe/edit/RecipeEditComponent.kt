package com.flyview.freecocktailbar.feature_recipe.edit

import kotlinx.coroutines.flow.StateFlow

interface RecipeEditComponent {

    val recipeName: StateFlow<String>
    val recipeDescription: StateFlow<String>

    fun onSaveClick()
    fun onCancelClick()
}