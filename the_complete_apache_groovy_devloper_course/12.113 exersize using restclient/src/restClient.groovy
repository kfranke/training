import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

String base = 'https://httpbin.org'
//String auth = '/basic-auth'
//String path = '/json'

def client = new RESTClient(base)
//def params = [user: "kevin", passwd: "Password123"]
client.contentType = ContentType.JSON

client.get( path: 'https://httpbin.org/json'){ response, json ->


    println response.status
    println json
}
