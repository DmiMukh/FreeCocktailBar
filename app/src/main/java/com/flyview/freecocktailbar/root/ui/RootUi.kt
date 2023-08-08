package com.flyview.freecocktailbar.root.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.stackAnimation
import com.flyview.freecocktailbar.feature_cocktail.details.CocktailDetailsUi
import com.flyview.freecocktailbar.feature_cocktail.list.CocktailListUi

@Composable
fun RootContent(
    component: RootComponent,
    modifier: Modifier = Modifier
) {
    val childStack = component.childStack.collectAsState()

    Children(
        stack = childStack.value,
        modifier = modifier,
        animation = stackAnimation(fade() + scale()),
    ) {
        when (val child = it.instance) {
            is RootComponent.Child.Details -> CocktailDetailsUi(child.component)
            is RootComponent.Child.List -> CocktailListUi(child.component)
        }
    }
}