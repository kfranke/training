import groovy.json.JsonSlurper

def books = '''
{
    "books": {
        "book1": {
            "isbn": "978-1935182443",
            "title": "Groovy in Action 2nd Edition",
            "author": {
                "first": "Dierk",
                "last": "Koenig"
            },
            "price": 50.58
        },
        "book2": {
            "isbn": "978-1935182948",
            "title": "Making Java Groovy",
            "author": {
                "first": "Ken",
                "last": "Kousen"
            },
            "price": 33.96
        },
        "book3": {
            "isbn": "978-1937785307",
            "title": "Programming Groovy 2: Dynamic Productivity for the Java Developer",
            "author": {
                "first": "Venkat",
                "last": "Subramaniam"
            },
            "price": 28.92
        }
    }
}
'''

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('data/books.json')) //note the differenc vs the xml sluper parse overide that could take a file directly
println json.getClass().getName()
println json.books.book2.title