package net.virtualvoid.rules

import scala.reflect.macros.whitebox.Context

object RuleImpl {
  def concatImpl[U](c: Context)(other: c.Tree)(implicit u: c.WeakTypeTag[U]): c.Tree = {
    import c.universe._

    val tpe =
      if (u.tpe <:< typeOf[Int]) typeOf[String]
      else typeOf[Any]

    q"""null: Rule[$tpe]"""
  }
}