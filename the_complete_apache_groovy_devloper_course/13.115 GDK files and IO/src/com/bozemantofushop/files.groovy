package com.bozemantofushop


def file = new File('foo.txt')
//file.write("Some garbage data\n")
//// also ok to do new File('foo.txt').text = "sometext"
//file.append("more garbage text\n")
//
//List lines = file.readLines()
//lines.each{ line ->
//    println line
//}

//list files in dir
//String dir = '/Users/kfranke/groovy'
////new File(dir).eachFile { file -> // non recursive
//new File(dir).eachFileRecurse { file -> //recursive
//    if ( file.isFile() ){
//        //println file.name
//        if( file.name.endsWith('.groovy') ){
//            println file.name
//        }
//    }
//}