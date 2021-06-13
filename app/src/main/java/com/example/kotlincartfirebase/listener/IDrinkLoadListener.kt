package com.example.kotlincartfirebase.listener

import com.example.kotlincartfirebase.model.DrinkModel

interface IDrinkLoadListener {
    fun onDrinkLoadSuccess(drinkModeList:List<DrinkModel>?)
    fun onDrinkLoadFailed(message:String?)
}