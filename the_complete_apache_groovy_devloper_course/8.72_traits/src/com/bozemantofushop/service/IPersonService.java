package com.bozemantofushop.service;

public interface IPersonService {
    //java 8
    default public void doSomething(){

        System.out.println("Doing Something");
    }
}
