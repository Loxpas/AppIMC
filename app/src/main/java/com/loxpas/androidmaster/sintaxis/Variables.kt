package com.loxpas.androidmaster.sintaxis


fun main() {
    showMyname(name = "Loxpas")
    showMyAge(currentAge = 29)
    add(25, 30)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMyname(name:String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int = 30) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber


fun subtractCool(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}





fun variableNumericas() {

    /* ------------ Variables ---------------- */

    //Int -2,147,483,647 a 2,147,483,647
    val age: Int = 30
    var age2: Int = 30


    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807 pero ocupa mas memoria en el dispositivo
    val example: Long = 30


    //Float
    val floatExample: Float = 30.5f  //se Pone "f" al Ultimo


    //Double es como el float pero soporta 14 decimales pero ocupa mas memoria en el dispositivo
    val doubleExample: Double = 3213.311313113

    println("Sumar:")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar:")
    println(age * age2)

    println("Division:")
    println(age / age2)

    println("Modulo")
    println(age % age2)

    var exampleSuma = age + floatExample


}

fun variableBoolean() {
    /*--------------Variables Booleanas-------------*/

    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
}

fun variableAlfanumerica() {
    /*--------------Variables Alfanumericas-------------*/
    val age: Int = 30
    var age2: Int = 30

    //Char Puedes poner lo que tu quieras pero solo 1 caracter
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'


    //String
    val stringExample1: String = "Hola, no se que poner"
    val stringExample2: String = "4"
    val stringExample3: String = "134"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    val example123: String = age.toString()

}

