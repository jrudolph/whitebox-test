package net.virtualvoid.rules

import scala.reflect.macros.Context

object RuleImpl {
  def concatImpl[U](c: Context)(other: c.Expr[Rule[U]])(implicit u: c.WeakTypeTag[U]): c.Expr[Any] = {
    import c.universe._

    val tpe =
      if (u.tpe <:< typeOf[Int]) typeOf[String]
      else typeOf[Any]

    c.Expr(q"""null: Rule[$tpe]""")
  }
}