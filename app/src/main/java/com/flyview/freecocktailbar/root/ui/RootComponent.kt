package com.flyview.freecocktailbar.root.ui

import com.arkivanov.decompose.router.stack.ChildStack
import com.flyview.freecocktailbar.feature_cocktail.details.CocktailDetailsComponent
import com.flyview.freecocktailbar.feature_cocktail.list.CocktailListComponent
import kotlinx.coroutines.flow.StateFlow

interface RootComponent {

    val childStack: StateFlow<ChildStack<*, Child>>

    sealed interface Child {

        class List(val component: CocktailListComponent) : Child
        class Details(val component: CocktailDetailsComponent) : Child
    }
}