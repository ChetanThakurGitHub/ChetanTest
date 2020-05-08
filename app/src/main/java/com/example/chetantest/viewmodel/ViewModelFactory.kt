package com.emedinaa.kotlinmvvm.viewmodel

import RecipeDataSource
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val repository:RecipeDataSource):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RecipeViewModel(repository) as T
    }
}