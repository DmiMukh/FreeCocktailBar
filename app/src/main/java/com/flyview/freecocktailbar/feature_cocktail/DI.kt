package com.flyview.freecocktailbar.feature_cocktail

import com.arkivanov.decompose.ComponentContext
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.feature_cocktail.details.RealCocktailDetailsComponent
import com.flyview.freecocktailbar.feature_cocktail.details.CocktailDetailsComponent
import com.flyview.freecocktailbar.feature_cocktail.list.RealCocktailListComponent
import com.flyview.freecocktailbar.feature_cocktail.list.CocktailListComponent

fun ComponentFactory.createRecipeFeatureListComponent(
    componentContext: ComponentContext
): CocktailListComponent {
    return RealCocktailListComponent(componentContext = componentContext)
}

fun ComponentFactory.createRecipeFeatureDetailsComponent(
    componentContext: ComponentContext
): CocktailDetailsComponent {
    return RealCocktailDetailsComponent(componentContext = componentContext)
}