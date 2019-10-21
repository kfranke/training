package com.bozemantofushop

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])
class Person {
    String first,last,email


//    @Override
//    public String toString() {
//        return "Person{" +
//                "first='" + first + '\'' +
//                ", last='" + last + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
