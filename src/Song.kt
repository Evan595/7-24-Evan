class Song (val title: String, val artist: String){
    fun play() {
        println("Playing $title by $artist")
    }

    fun stop() {
        println("$title stopped playing")
    }

}

fun main(args: Array<String>) {
    val songOne = Song("Song1", "Artist1")
    val songTwo = Song("Song2", "Artist2")
    val songThree = Song("Song3", "Artist3")
    songTwo.play()
    songTwo.stop()
}