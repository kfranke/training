package com.bozemantofushop

class POGO{

    String property
    void setProperty(String name, Object value){
        this.@"$name" = 'overridden'
    }
}
def pogo = new POGO()
pogo.property = 'something'
println pogo.property //overridden
