fun main(args: Array<String>) {
    // Safe calling dengan ?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let {
        println("Nilai maybeNumber adalah: $it")
    }

    // Contoh penggunaan ?. chaining dengan objek nyata
    val student = Student(Teacher(Supervisor("John Doe")))
    println("Nama supervisor: ${student.teacher?.supervisor?.name}")
}

// Contoh kelas berantai untuk ?. chaining
class Student(var teacher: Teacher?)
class Teacher(var supervisor: Supervisor?)
class Supervisor(var name: String)