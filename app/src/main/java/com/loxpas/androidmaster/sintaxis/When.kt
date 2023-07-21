package com.loxpas.androidmaster.sintaxis

fun main(){
    getSemester(month=2)
}




fun result(value:Any){
    when (value){
        is Int -> value + value
        is String -> println(value)
    }
}

fun getSemester(month:Int) = when(month){
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12 -> "Semestre no valido" //El ! convierte al reves lo que es, por ejemplo si es verdadero lo hace falso
        else -> "dadwa"
    }

fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getMonth(month:Int){
   when(month){
       1 -> println("Enero")
       2 -> println("Febrero")
       3 -> println("Marzo")
       4 -> println("Abril")
       5 -> println("Mayo")
       6 -> println("Junio")
       7 -> println("Julio")
       8 -> println("Agosto")
       9 -> println("Septiembre")
       10 -> println("Octubre")
       11-> println("Noviembre")
       12 -> {
           println("Diciembre")
           println("Diciembre")
       }
           else -> println("No es un mes valido")
   }
}

// 2:7:20