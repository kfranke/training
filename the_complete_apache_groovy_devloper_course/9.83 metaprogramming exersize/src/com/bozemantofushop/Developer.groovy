package com.bozemantofushop

class Developer {

    String first,last,email
    List languages

    Developer(){

    }
    def invokeMethod(String name, Object args){ //gets called if we try to use method that doesnt exist
        println "invokeMethod() called with args: $args"
    }
    def getProperty(String property){
        println "getProperty called"
        metaClass.getProperty(this,property)
    }
    void setProperty(String property, Object newValue){
        println "setProperty() called with name $property and vewValue: $newValue"
        metaClass.setProperty(this,property, newValue)
    }
}
