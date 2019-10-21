package com.bozemantofushop

class MyEmployee{
    def methodMissing(String name, def args){
        if(name != 'someMethod'){
            throw new MissingMethodException(name,this.getClass(),args)
        }
        println "methodMissing called on: $name"
        println "with arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,3)
emp.someOtherMethod(4,5,6)