package com.bozemantofushop

import groovy.json.JsonBuilder

List books = [
        [isbn: '978-1935182443', title: 'Groovy in Action 2nd Edition', author: 'Dierk Koenig', price: 50.58],
        [isbn: '978-1935182948', title: 'Making Java Groovy', author: 'Ken Kousen', price: 33.96],
        [isbn: '978-1937785307', title: 'Programming Groovy 2: Dynamic Productivity for the Java Developer', author: 'Venkat Subramaniam', price: 28.92]
]

JsonBuilder builder = new JsonBuilder()

builder.books{
    books.eachWithIndex{ item, i ->
        element = "book" + i.toString()
        element.toString()
        element{
            isbn item.isbn
            title item.title
            author(name: item.author, twitter: '@handle')
            related "some related book", "another book"
        }
    }

}

//    books.eachWithIndex { item, i ->
//        builder.item {
//            isbn item.isbn
//            title item.title
//            author(name: item.author, twitter: '@handle')
//            related "some related book", "another book"
//        }
//    }


println builder.toPrettyString()
//new File('json/books.json').write(builder.toPrettyString())