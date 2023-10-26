package com.exercise.tbchomeworktwo

class ExerciseArrays {
    fun userInputNumber(input: Int): String {
        if (input < 1 && input > 1000) return "გთხოვთ შეიყვანეთ 1000მდე 1დან"
        if (input == 1000) return "ათასი"
        if (input in 1..19) {
            return basicNumbers[input]
        } else if (input >= 20 && input < 100) {
            if (input % 20 == 0) {
                var num = (input / 10) / 2
                return wholeumNubersTwo[num] // 20 40 60 80
            } else {
                // 27 44 56 89 90
                var someString = ""
                someString += roundOnes[input / 10]
                if (input % 10 == 0) {
                    someString += basicNumbers[10]
                } else if (list.contains(input / 10)) {
                    var number = 10 + input % 10
                    someString += basicNumbers[number]
                } else {
                    someString += basicNumbers[input % 10]
                }
                return someString
            }

        } else if (input >= 100 && input <= 999) {
            if (input % 100 == 0) {
                return onlyHundred[input / 100 - 1]
            } else {
                var someString = ""
                someString += hundreds[(input / 100) - 1]
                someString += getStringFromTwoDigits(input % 100)
                return someString
            }
        }
        return ""
    }


    fun getStringFromTwoDigits(input: Int): String {
        if (input in 1..19) {
            return basicNumbers[input]
        }
        if (input >= 20 && input < 100) {
            if (input % 20 == 0) {
                var num = (input / 10) / 2
                return wholeumNubersTwo[num]
            } else {
                var someString = ""
                someString += roundOnes[input / 10]
                if (input % 10 == 0) {
                    someString += basicNumbers[10]
                } else if (list.contains(input / 10)) {
                    var number = 10 + input % 10
                    someString += basicNumbers[number]
                } else {
                    someString += basicNumbers[input % 10]
                }
                return someString
            }
        }else{
            return ""
        }
    }

    var list = listOf(3, 5, 7, 9)

    val roundOnes = arrayOf(
        "",
        "",
        "ოცდა", //20
        "ოცდა",//30
        "ორმოცდა",
        "ორმოცდა",
        "სამოცდა",
        "სამოცდა",
        "ოთხმოცდა",
        "ოთხმოცდა"
    )

    var basicNumbers = arrayOf(
        "", "ერთი", "ორი", "სამი", "ოთხი", "ხუთი", "ექვსი", "შვიდი", "რვა", "ცხრა",
        "ათი", "თერთმეტი", "თორმეტი", "ცამეტი", "თოთხმეტი", "თხუთმეტი", "თექვსმეტი", "ჩვიდმეტი", "თვრამეტი", "ცხრამეტი"
    )

    var hundreds = arrayOf("ას", "ორას", "სამას", "ოთხას", "ხუთას", "ექვსას", "შვიდას", "რვაას", "ცხრაას")

    var wholeumNubersTwo = arrayOf("", "ოცი", "ორმოცი", "სამოცი", "ოთხმოცი")

    var onlyHundred =
        arrayOf("ასი", "ორასი", "სამასი", "ოთხასი", "ხუთასი", "ექვსასი", "შვიდასი", "რვაასი", "ცხრაასი", "ათასი")


}