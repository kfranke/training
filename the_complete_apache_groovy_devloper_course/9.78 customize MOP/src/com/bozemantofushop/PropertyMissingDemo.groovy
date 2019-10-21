package com.bozemantofushop

//this is way easier way to check for missing properies

class Foo {

    def propertyMissing(String name){
        return "caught missing property: $name"
    }
}
println new Foo().bar