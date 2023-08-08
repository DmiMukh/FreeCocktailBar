package com.flyview.freecocktailbar.feature_cocktail.list

import com.arkivanov.decompose.ComponentContext

class RealCocktailListComponent(
    componentContext: ComponentContext
): ComponentContext by componentContext, CocktailListComponent {

    override fun addRecipe() {
        TODO("Not yet implemented")
    }
}