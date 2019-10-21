package com.bozemantofushop

Person p1 = new Person("kevin","brown")
Person p2 = new Person("sue","candy")
Person p3 = new Person("bob","darby")
Person p4 = new Person("bill","echo")
Person p5 = new Person("andy","echo")


def people = [p1,p2,p3,p4,p5]
println people
println people.toSorted() // but this wont work unless @Sortable because it can't compare items.. doesnt know what to do
