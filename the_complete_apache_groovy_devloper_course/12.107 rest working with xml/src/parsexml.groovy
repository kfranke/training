//import groovy.util.XmlSlurper

def xml = '''
<sports>
  <sport id="1">
    <name>baseball</name>
    <difficulty>medium</difficulty>
  </sport>
</sports>
'''

def sports = new XmlSlurper().parseText(xml)
//println sports.getClass().getName()
//println sports.sport.name
//println sports.sport.difficulty

def sports1 = new XmlSlurper().parse('data/sports.xml')
println sports1.sport[2].name

sports1.sport.each { item ->
    println item.name
}