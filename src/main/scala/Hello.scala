object Hello {
  def main(_unused: Array[String]) {
    val h: HugeEnum = HugeEnum.X1
    // this is exhaustive (because existence of the "default" arm), but 2.13.12 does not agree with it.
    h match {
      case HugeEnum.X4 => println("hi!")
      case _ => println("other")
    }
  }
}
