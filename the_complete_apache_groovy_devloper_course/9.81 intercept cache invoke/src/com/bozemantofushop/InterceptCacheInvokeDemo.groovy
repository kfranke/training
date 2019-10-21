package com.bozemantofushop

class Developer extends Expando{

    List languages = []
    def methodMissing(String name, args){
        println "${name}() method was called"
        if(name.startsWith('write')){
            String language = name.split("write")[1]
            if( languages.contains(language) ){
                def impl = {Object[] theArgs ->
                    println "i like to write code in $language"
                }
                getMetaClass()."${name}" = impl
                return impl(args)
            }
        }
    }
}

Developer dan = new Developer()
dan.languages << "Groovy"
dan.languages << "Java"
println dan.metaClass.methods.size()
dan.writeGroovy()
dan.writeGroovy()
dan.writeGroovy()
    println dan.metaClass.methods.size()
dan.writeJava()
println dan.metaClass.methods.size()
