package com.bozemantofushop

import groovy.transform.TypeChecked

@TypeChecked //this makes it check variables/params and such when compiling
class Person {

    String first,last

    String getFullName(){
        return "$first $last"
    }
}
