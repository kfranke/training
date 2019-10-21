package com.bozemantofushop

@groovy.transform.ToString
class Employee implements Serializable{

    String first,last,email
    String fullName

    void setFullName(String name){
        fullName = first + last
    }
    String getFullName(){
        "Full name: ${fullName}"
    }

}
