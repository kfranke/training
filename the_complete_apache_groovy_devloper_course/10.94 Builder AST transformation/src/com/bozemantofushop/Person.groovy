package com.bozemantofushop

import groovy.transform.ToString
import groovy.transform.builder.Builder

@Builder
@ToString
class Person {

    String first,middle,last,email
    Date hireon
    List languagues

}
