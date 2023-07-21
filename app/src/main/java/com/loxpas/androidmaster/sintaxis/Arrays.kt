package com.loxpas.androidmaster.sintaxis

fun main(){
    var name:String = "Loxpas"
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //println(weekDays[0])
    //println(weekDays.size)


    //Tamaños
    if(weekDays.size >= 8){
        //println(weekDays[7])
    }else{
        //println("No hay mas valores")
    }


    //Modificar valores
    weekDays[0] = "Holita"

    //println(weekDays[0])

    // Bucles para array


    //Se imprime por el numero de veces del pocisionamiento del array
    for(position in weekDays.indices){
        //println("He pasado por aqui $position")
        //println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        //println("La pocision $position, contieme $value")
    }

    for(weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}