package com.bozemantofushop

Person p1 = new Person(first:"kevin",last:"brown",email:"kbrown@email.com")
Person p2 = new Person(first:"kevin",last:"brown",email:"kbrown@email.com")
Person p3 = new Person(first:"sally",last:"brown",email:"sbrown@email.com")


assert p1 == p2 //fails unless @EqualsAndHashCode
assert p1 == p3 //fails unless add the excludes property for first & email to @Equals... 
