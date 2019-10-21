package com.bozemantofushop

Expando e = new Expando()

e.first = 'kevin'
e.last = 'brown'
e.email = 'kbrown@email.com'

e.getFullName = { //made our own method in Expando
    return "$first $last"
}

println e.getFullName()

@groovy.transform.ToString(includeNames=true)
class Person{
    String first, last
}
Person p = new Person(first: "kevin",last:"brown")
p.metaClass.email = "kbrown@eamil.com" //set this prop even though it didnt exist
println p
println p.email