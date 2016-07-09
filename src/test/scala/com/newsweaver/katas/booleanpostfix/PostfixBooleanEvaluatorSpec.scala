package com.newsweaver.katas.booleanpostfix

import org.scalatest.{FunSpec, Matchers}

class PostfixBooleanEvaluatorSpec extends FunSpec with Matchers {

  val sampleResults = List(
    ("0 1 R", true),
    ("0 0 R", false),
    ("0 1 A 0 N R", true),
    ("1 0 A 1 R N N", true),
    ("0 0 A 0 N 0 N A R", true),
    ("0 1 A 0 N 1 N A R", false),
    ("1 0 A 1 N 0 N A R", false),
    ("1 1 A 1 N 1 N A R", true),
    ("1 1 A 1 N 1 N A X", true),
    ("1 1 A 0 N 0 N A X", false)
  )

  describe("PostfixBooleanEvaluator") {
    sampleResults.foreach { case (expression, result) =>
      it(s"should evaluate $expression to $result") {
        PostfixBooleanEvaluator.evaluate(expression) shouldBe result
      }
    }
  }

}
