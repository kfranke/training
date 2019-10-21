package com.bozemantofushop
//note that this will throw an classNotFoundException unless you place and refactor this to the root src folder
import groovy.transform.ToString

@ToString(includeNames = true)
class Book {
    String title, summary
    List<Section> sections = []
}
@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}
@ToString(includeNames = true)
class Chapter {
    String title
}

ObjectGraphBuilder builder = new ObjectGraphBuilder()

def book = builder.book(
        title: "How to fork up your life",
        summary: "Seventeen easy steps to completely bork your world"
) {
    section(title: 'com.bozemantofushop.Section 1 - Destroy your self worth') {
        chapter(title: 'com.bozemantofushop.Chapter 1')
        chapter(title: 'com.bozemantofushop.Chapter 2')
        chapter(title: 'com.bozemantofushop.Chapter 3')
    }
    section(title: 'com.bozemantofushop.Section 2 - Your interactions') {
        chapter(title: 'com.bozemantofushop.Chapter 1')
        chapter(title: 'com.bozemantofushop.Chapter 2')
        chapter(title: 'com.bozemantofushop.Chapter 3')
    }
}

println book