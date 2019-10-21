package com.bozemantofushop

class InvokeDemo {
    def invokeMethod(String name, Object args){
        return "called invokeMethod $name $args"
    }
    def test(){

        return "Method Exists"
    }
}

def invokeDemo = new InvokeDemo()
assert invokeDemo.test() == "Method Exists"
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'