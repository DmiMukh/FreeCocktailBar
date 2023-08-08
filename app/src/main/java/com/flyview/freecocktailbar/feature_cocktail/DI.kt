package com.flyview.freecocktailbar.feature_cocktail

import com.arkivanov.decompose.ComponentContext
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.feature_cocktail.details.RealCocktailDetailsComponent
import com.flyview.freecocktailbar.feature_cocktail.details.CocktailDetailsComponent
import com.flyview.freecocktailbar.feature_cocktail.edit.CocktailEditComponent
import com.flyview.freecocktailbar.feature_cocktail.edit.RealCocktailEditComponent
import com.flyview.freecocktailbar.feature_cocktail.list.RealCocktailListComponent
import com.flyview.freecocktailbar.feature_cocktail.list.CocktailListComponent


fun ComponentFactory.createRecipeFeatureDetailsComponent(
    componentContext: ComponentContext
): CocktailDetailsComponent {
    return RealCocktailDetailsComponent(componentContext = componentContext)
}
fun ComponentFactory.createRecipeFeatureEditComponent(
    componentContext: ComponentContext
): CocktailEditComponent {
    return RealCocktailEditComponent(componentContext = componentContext)
}

fun ComponentFactory.createRecipeFeatureListComponent(
    componentContext: ComponentContext,
    onCocktailClick: () -> Unit
): CocktailListComponent {
    return RealCocktailListComponent(
        componentContext = componentContext,
        onEditCocktail = onCocktailClick
    )
}