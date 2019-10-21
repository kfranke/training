package com.bozemantofushop

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(excludes = ["first","email"])
class Person {
    String first,last,email

}
