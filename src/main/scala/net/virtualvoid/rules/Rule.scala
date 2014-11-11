package net.virtualvoid.rules

import scala.language.experimental.macros

trait Rule[T] {
  def ~>[R](f: T ⇒ R): Rule[R]
  def ~[U](other: Rule[U]): Any = macro RuleImpl.concatImpl[U]
}
