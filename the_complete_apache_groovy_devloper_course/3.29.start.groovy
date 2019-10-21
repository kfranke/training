
if ( true )
    println "Value is true"

if ( false )
    println "value is false"
    
String name = null
if(name)
    println "name has a value"
    
String foo = ""
if(foo)
    println "foo has a value"
    
def x = 5
if (x == 10) {
        println "x is 10"
        }else{
    println "x is not 10"
    }


def i = 1
while(i <= 10){
println i
i++
}

def list = [1,2,3,4,5,6,7]
for(item in list){
println item
}
//closure
def list2 = [1,2,3,4,5]
list2.each {println it}

//switch

def myNumber = 1
switch(myNumber){
    case 1:
        println "number is $myNumber" 
        break
    default:
        println "number is default"
}
