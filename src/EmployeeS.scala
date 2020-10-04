class EmployeeS(val name: String, val address: String) {
  private val id = EmployeeS.nextId()
}

object EmployeeS {
  // factory method
  def apply(name: String, address: String) = new EmployeeS(name, address)

  def main(args: Array[String]) {
  // EmployeeS.apply("Bob Fossil", "1 London Road")
    EmployeeS("Bob Fossil", "1 London Road")
  }

  private var sequenceOfIds = 0

  private def nextId() = {
    sequenceOfIds += 1
    sequenceOfIds
  }
}
