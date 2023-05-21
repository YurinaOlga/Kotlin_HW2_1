fun main() {
     println(agoToText(1260))

}

fun agoToText (timeAgo:Int)= when {
    timeAgo < 60 -> "был(а) только что"
    timeAgo < 60*60 -> "был(а) " + (timeAgo/60) + endingMinutes(timeAgo) + " назад"
    timeAgo < 24*60*60 -> "был(а) " + (timeAgo/(60*60)) + endingHours(timeAgo) + " назад"
    timeAgo < 2*24*60*60 -> "был(а) вчера"
    timeAgo < 3*24*60*60  -> "был(а) позавчера"
    else -> "был(а) давно"
      }

fun endingMinutes (timeAgo: Int):String {
    val countLastDigit =(timeAgo/60)%10
    val countSecondOrderDigit = (timeAgo/60/10)%10
    val wordMinutes = when {
                        countLastDigit == 1 && countSecondOrderDigit!=1  -> " минуту"
                        countLastDigit > 1 && countLastDigit < 5 && countSecondOrderDigit!=1  -> " минуты"
                        else -> " минут"
    }
    return wordMinutes
}

fun endingHours (timeAgo: Int):String {
    val countLastDigit =(timeAgo/(60*60))%10
    val countSecondOrderDigit = (timeAgo/(60*60)/10)%10
    val wordHours = when {
        countLastDigit == 1 && countSecondOrderDigit!=1  -> " час"
        countLastDigit > 1 && countLastDigit < 5 && countSecondOrderDigit!=1  -> " часа"
        else -> " часов"
    }
    return wordHours
}

