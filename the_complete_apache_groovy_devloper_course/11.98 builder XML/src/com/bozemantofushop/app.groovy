package com.bozemantofushop

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true
// some MOP action for missing method?
builder.sports {
    sport(id:1){
        name 'baseball'
        players(type:'number'){ value '12' }
    }
    sport(id:2){
        name 'basketball'
    }
    sport(id:3){
        name 'football'
    }
    sport(id:4){
        name 'hockey'
    }
    sport(id:null,foo:''){
        name ''
    }
}