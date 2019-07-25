class Dog (val name: String, var weight: Int, val breed: String) {
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

    var myDog = Dog("Fido", 70, "Mixed")
    var dogs = arrayOf(Dog("Fido", 70, "Mixed"), Dog("Ripper", 10, "Poodle"))
}



//    print(myDog.breed)
//    print(myDog.name)
//    myDog.bark()
