fun timeConversion(s: String): String {
    var hours = s.slice(0..1)
    if (s.contains("P") && hours != "12") hours = "${hours.toInt() + 12}"
    if (s.contains("A") && hours == "12") hours = "00"
    return "$hours${s.slice(2..7)}"
}
//Time Complexity: O(1)
