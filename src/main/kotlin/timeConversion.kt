fun timeConversion(s: String): String {
    var x = ""
    val aMpM = s.substring(s.length-2)
    val twelve = "12"
    val hours = s.substring(0, 2)
    if(aMpM == "PM" && hours != twelve) {
        x = s.replaceRange(0,2,(hours.toInt()+12).toString()).substring(0,s.length-2)
    } else if (aMpM == "AM" && hours == twelve){
        x = s.replaceRange(0,2,"00").substring(0,s.length-2)
    } else x = s.substring(0,s.length-2)
    return x
}
