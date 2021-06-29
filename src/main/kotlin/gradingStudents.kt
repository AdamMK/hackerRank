fun gradingStudents(grades: Array<Int>): Array<Int> = grades.map { eachGrade(it)}.toTypedArray()

fun eachGrade(grade: Int): Int = if (grade >= 38 && (grade+5) % 5 >= 3) { (grade+(5-grade%5)) } else grade

