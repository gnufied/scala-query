package com.novocode.squery.combinator

abstract class ColumnOption[+T]

object ColumnOption {
  case object AutoInc extends ColumnOption
  case object NotNull extends ColumnOption
  case class Default[T](val defaultValue:T) extends ColumnOption[T]
}
