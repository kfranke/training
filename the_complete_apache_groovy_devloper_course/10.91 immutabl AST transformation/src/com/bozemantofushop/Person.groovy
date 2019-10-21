package com.bozemantofushop

import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@ToString
@Immutable
class Person {

    String first,last
}
