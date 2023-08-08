package com.flyview.freecocktailbar.feature_recipe.list

import com.arkivanov.decompose.ComponentContext

class RealRecipeListComponent(
    componentContext: ComponentContext
): ComponentContext by componentContext, RecipeListComponent {

    override fun addRecipe() {
        TODO("Not yet implemented")
    }
}