package com.bozemantofushop

println "enter your name please"
String name
System.in.withReader { reader ->
    name = reader.readLine()
}
println "Thank you $name. Have a great day"