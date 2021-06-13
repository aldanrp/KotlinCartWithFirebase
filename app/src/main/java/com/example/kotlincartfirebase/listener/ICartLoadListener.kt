package com.example.kotlincartfirebase.listener

import com.example.kotlincartfirebase.model.CartModel

interface ICartLoadListener {
    fun onLoadCartSuccess(cartModeList: List<CartModel>)
    fun onLoadCartFailed(message:String)
}