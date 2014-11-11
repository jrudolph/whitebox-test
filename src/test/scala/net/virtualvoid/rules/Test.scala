package net.virtualvoid.rules

object Test {
  val x: Rule[Int] = null
  val y: Rule[Int] = null

  x ~ y ~> (_.length)
}
