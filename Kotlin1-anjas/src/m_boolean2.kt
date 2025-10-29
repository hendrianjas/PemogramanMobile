fun main(args: Array<String>) {
    var varBool : Boolean = true
    if(varBool)
        println("varBool bernilai " + varBool)
    var varInt : Int = 1
    if(varBool) // if tidak bisa varint. jika ingin varint harus ada pembanding
        println("varInt bernilai " + varInt)
}