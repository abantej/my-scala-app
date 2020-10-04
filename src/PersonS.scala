class PersonS(forename: String, initial: String = "", surname: String) {
  val fullname = if (initial != null && !initial.isEmpty)
    forename + " " + initial + ". " + surname
  else
    forename + " " + surname
//  auxillary constructor
//  def this(forename: String, surname: String) {
//    this(forename, "", surname)
//  }
}

object PersonS {
  def main(args: Array[String]): Unit = {
    new PersonS("Bob", "J", "Smith")
    new PersonS("Bob", surname = "Smith")
  }
}
