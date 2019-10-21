package com.bozemantofushop

import groovy.transform.Canonical
import groovy.transform.Sortable

@Canonical
@Sortable( includes = ['last', 'first'] ) // order of sorting
class Person {

    String first,last
}
