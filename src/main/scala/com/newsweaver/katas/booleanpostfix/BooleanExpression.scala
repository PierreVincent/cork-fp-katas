package com.newsweaver.katas.booleanpostfix

sealed trait BooleanExpression {
  def reduce: Boolean
}

final case class BooleanLiteral(value: String) extends BooleanExpression {
  def reduce: Boolean = value match {
    case "0" => false
    case "1" => true
  }
}

final case class NotOperator(v: BooleanExpression) extends BooleanExpression {
  def reduce: Boolean = !v.reduce
}

final case class BinaryOperator(op: String, a: BooleanExpression, b: BooleanExpression) extends BooleanExpression {
  def reduce: Boolean = {
    val f: (Boolean, Boolean) => Boolean = op match {
      case "A" => _ && _
      case "R" => _ || _
      case "X" => _ ^ _
    }
    f(a.reduce,b.reduce)
  }
}