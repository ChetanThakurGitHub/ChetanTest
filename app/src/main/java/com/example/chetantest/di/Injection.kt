package com.emedinaa.kotlinmvvm.di

import RecipeDataSource
import RecipeRepository
import androidx.lifecycle.ViewModelProvider
import com.emedinaa.kotlinmvvm.viewmodel.ViewModelFactory

object Injection {

    private val RECIPE_DATA_SOURCE:RecipeDataSource = RecipeRepository()
    private val museumViewModelFactory = ViewModelFactory(RECIPE_DATA_SOURCE)

    fun providerRepository():RecipeDataSource{
        return RECIPE_DATA_SOURCE
    }

    fun provideViewModelFactory(): ViewModelProvider.Factory{
        return museumViewModelFactory
    }
}