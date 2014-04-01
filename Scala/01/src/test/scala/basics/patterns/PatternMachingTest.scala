package basics.patterns

import org.scalatest.FunSuite

class PatternMachingTest extends FunSuite {
  test("Patter match") {
    assert(PatternMatching.doMatchnigValue(1) === "one")
    assert(PatternMatching.doMatchnigValue(2) === "two")
    assert(PatternMatching.doMatchnigValue(24) === "unknown")
  }

  test("Patter match2") {
    assert(PatternMatching.doMatchnigType(1) === "int")
    assert(PatternMatching.doMatchnigType("sss") === "string")
    assert(PatternMatching.doMatchnigType(24.0) === "double")
  }

  test("Patter match3") {
    assert(PatternMatching.doMatchingCaseClass(MatchedClass(1)) === "1")
    assert(PatternMatching.doMatchingCaseClass(MatchedClass(2)) === "2")
    assert(PatternMatching.doMatchingCaseClass(MatchedClass(32)) === "other")
  }
}