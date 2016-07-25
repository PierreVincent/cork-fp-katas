package com.newsweaver.katas.booleanpostfix

object PostfixBooleanEvaluator2 {

  def evaluate(s: String): Boolean = {
    s.split(" ").toList.foldLeft(List.empty[Boolean]) {
      case (stack, "0") => false :: stack
      case (stack, "1") => true :: stack
      case ((x :: tail), "N") => !x :: tail
      case ((x1 :: x2 :: tail), "A") => (x1 && x2) :: tail
      case ((x1 :: x2 :: tail), "R") => (x1 || x2) :: tail
      case ((x1 :: x2 :: tail), "X") => (x1 ^ x2) :: tail
    }.head
  }

}
