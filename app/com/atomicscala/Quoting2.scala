package com.atomicscala

// Quoting2.scala

package object atomicscala {
  implicit class AnyName(val s:String)
  extends AnyVal {
    def singleQuote = s"'$s'"
    def doubleQuote = s""""$s""""
  }
}
