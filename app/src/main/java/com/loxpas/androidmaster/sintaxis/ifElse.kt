package com.loxpas.androidmaster.sintaxis

fun main(){
    ifMultiple()
}

fun ifMultipleOr(){
    var pet = "cat"
    var isHappy = true

    if(pet == "cat" || (pet == "dog" && isHappy)){
        println("Es un perro o un gato")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
            println("Puedo beber")
    }
}

fun ifInt(){
    var age = 29

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = false

    if(!soyFeliz){                                     //sin nada == true
      println("Estoy triste :(")                          //con ! al principio es == false
    }
}

fun ifAnidado(){
    val animal = "gallina"

    if(animal == "dog"){
        println("Es un perrito")
    }else if(animal == "cat"){
        println("Es un gato")
    }else if(animal == "pajaro"){
        println("Es un pajaro")
    }else{
        println("No es uno de los animales esperados")
    }
}

fun ifBasico() {
    val name = "Pablo"

    if (name == "Loxpas") {
        println("Oye, la variable name es Loxpas")
    } else {
        println("Ese no es Loxpas")
    }
}


