package com.bozemantofushop

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

//this is like TypeChecked but this bypasses the MOP... the groovy metaprogramming stuff

@CompileStatic
class Person {

    String firstname,lastname

    String foo(){
        return "foo"
    }
    String bar(){
        return "bar"
    }
    //turn off the compilestatic check
    @CompileStatic(TypeCheckingMode.SKIP)
    void nothing(){

    }
}
