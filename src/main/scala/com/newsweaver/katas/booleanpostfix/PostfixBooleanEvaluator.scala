package com.newsweaver.katas.booleanpostfix

object PostfixBooleanEvaluator {

  def evaluate(s: String): Boolean = {
    readExpression(s.split(" ").toList.reverse)._1.reduce
  }

  def readExpression(l: List[String]): (BooleanExpression, List[String]) = {
    l match {
      case (bl@("0"|"1")) :: tail => (BooleanLiteral(bl), tail)
      case (op@("A"|"R"|"X")) :: tail =>
        val (left, tailLeft) = readExpression(tail)
        val (right, tailRight) = readExpression(tailLeft)
        (BinaryOperator(op, left, right), tailRight)
      case "N" :: tail =>
        val (left, tailLeft) = readExpression(tail)
        (NotOperator(left), tailLeft)
    }
  }

}


