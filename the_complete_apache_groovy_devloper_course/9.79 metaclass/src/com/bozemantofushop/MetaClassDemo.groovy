package com.bozemantofushop

//Expando e = new Expando()
//e.name = 'kevin'
//e.writeCode = { -> println "$name loves to write code"}
//e.writeCode()

class Developer{

}
//per instance
Developer kevin = new Developer()
kevin.metaClass.name = 'kevin'
kevin.metaClass.writeCode = { -> println "$name loves to code"}
kevin.writeCode()

//every instance.... be careful
String.metaClass.shout = { -> toUpperCase() }

println "hello kevin".shout() //think how confusing this would be if someone didnt know you'd added a metaClass property to the String method
