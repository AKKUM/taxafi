package com.atomicscala

// CompiledWithArgs.scala

object EchoArgs extends App {
  for(arg <- args)
    println(arg)
}
