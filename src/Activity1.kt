fun main(args: Array<String>) {
//    var x = 1
//    while (x < 3) {
//        print(if (x == 1) "Yab" else "Dab")
//        print("ba")
//        x = x + 1
//    }
//    if (x == 3) print("Do")

//    var x = 1
//    while (x < 10){
//        x = x+1
//        if (x > 3){
//            println("big x")
//        }
//    }


//    var x = 10
//    while (x > 1) {
//        x = x - 1
//        if (x < 3) println("small x")
//    }


    var x = 0
    var y = 0
    while (x < 5) {
        if (y < 5) {
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3

        print ("$x$y")
        x = x + 1
    }



}
