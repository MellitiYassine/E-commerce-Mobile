package com.projet.mobile

class Product(
    var name: String,
    var reference: String,
    var manufacturer: String,
    var price: Double,
    var quantity: Int
        ){
    fun changeName(name: String){
        this.name = name
    }
}