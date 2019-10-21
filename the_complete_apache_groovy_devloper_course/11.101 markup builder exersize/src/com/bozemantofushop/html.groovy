package com.bozemantofushop

import groovy.xml.MarkupBuilder
FileWriter fp = new FileWriter('html/page.html')
List books = [
        [isbn: '978-1935182443', title: 'Groovy in Action 2nd Edition', author: 'Dierk Koenig', price: 50.58],
        [isbn: '978-1935182948', title: 'Making Java Groovy', author: 'Ken Kousen', price: 33.96],
        [isbn: '978-1937785307', title: 'Programming Groovy 2: Dynamic Productivity for the Java Developer', author: 'Venkat Subramaniam', price: 28.92]
]
MarkupBuilder mu = new MarkupBuilder()

mu.books{
    books.each{ item ->
        book( isbn: item.isbn ){
            title "${item.title}"
            author "${item.author}"
            price item.price
        }
    }
}

MarkupBuilder html = new MarkupBuilder(fp)
html.html{
    head{
        title 'Section 11, Lecture 101 Exersize'
    }
    body{
        h2 'Books for sale'
        books.each { item ->
            ul {
                li item.title
                ul{
                    li item.author
                    li item.price
                    li item.isbn
                }
            }
        }

    }
}