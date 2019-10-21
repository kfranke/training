import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

String base = 'https://api.icndb.com'

def chuck = new RESTClient(base)
def params = [firstName: "kevin", lastName: "brown"]
chuck.contentType = ContentType.JSON

chuck.get( path: '/jokes/random', query: params){ response, json ->

    println response.status
    println json
}