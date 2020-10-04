// [primary constructor]
// [val] tells the compiler to treat the arguments as fields
// scala generates setters and getters automatically
class CustomerS(val name: String, val address: String) {
  var id = ""
}

object CustomerS {
  def main(args: Array[String]) {
    val eric = new CustomerS("Eric", "Acacia Road")
    eric.id = "000001"
    // eric.id_=("000001")
  }
}
