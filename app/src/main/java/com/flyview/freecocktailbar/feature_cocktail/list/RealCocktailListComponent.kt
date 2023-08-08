package com.flyview.freecocktailbar.feature_cocktail.list

import com.arkivanov.decompose.ComponentContext

class RealCocktailListComponent(
    componentContext: ComponentContext,
    private val onEditCocktail: () -> Unit
): ComponentContext by componentContext, CocktailListComponent {

    override fun addRecipe() {
        onEditCocktail()
    }
}