package com.bozemantofushop

Date today = new Date()

println today
println "------------------"

Date bday = new Date("08/01/1982")
//println bday

//println bday.format("Y-MM-dd")

//adding and sub
//println today.plus(7)
//println today.minus(7)
//println today - 17
// down to and upto

today.plus(7).downto(today){
//    println it
}

Range twoweeks = today.minus(7)..today.plus(7)
twoweeks.each{ day ->
//    println day.format("EEEE")
}

//next and pre
Date newyear = new Date("01/01/2019")
//println newyear.next()
//println newyear.previous()

Date now = new Date()
println now.toTimestamp() //sql format
