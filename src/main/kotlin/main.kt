package ru.netology

fun main() {

    val itemPrice = 500
    val itemCount = 22
    val discountMin = 100
    val discountMax = 5
    val discountStartMin = 1_000
    val discountStartMax = 10_000
    val person = false
    val personDiscount = 1

    val totalPrice = itemPrice * itemCount
    var result = 0

    if (totalPrice <= discountStartMin && person) {
        result = totalPrice - totalPrice * personDiscount / 100
    } else if (totalPrice <= discountStartMin) {
        result = totalPrice
    } else if ((totalPrice > discountStartMin) && (totalPrice <= discountStartMax) && person) {
        result = (totalPrice - discountMin) - (totalPrice - discountMin) * personDiscount / 100
    } else if ((totalPrice > discountStartMin) && (totalPrice <= discountStartMax)) {
        result = totalPrice - discountMin
    } else if (totalPrice > discountStartMax && person) {
        result = (totalPrice - totalPrice * discountMax / 100) -
                ((totalPrice - totalPrice * discountMax / 100) * personDiscount / 100)
    } else if (totalPrice > discountStartMax) {
        result = totalPrice - (totalPrice * discountMax / 100)
    }

    println("Стоимость покупки $result рублей")
}