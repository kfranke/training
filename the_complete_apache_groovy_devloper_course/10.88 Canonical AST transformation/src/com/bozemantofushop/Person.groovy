package com.bozemantofushop

import groovy.transform.Canonical

@Canonical
class Person {

    String first,last
    String email = "default@email.com"
}
