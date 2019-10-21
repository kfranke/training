package com.bozemantofushop

// to all Integers.. danger danger
Integer.metaClass.timesTwo = {delegate * 2}

println 2.timesTwo()
println 36.timesTwo()

class MyClass{

}
MyClass me = new MyClass()
me.metaClass.squareIt = { int x -> println x * x}
me.squareIt(10)