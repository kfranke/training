package com.bozemantofushop
FileWriter writer = new FileWriter('html/helloWorld.html')
import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder(writer)
List animals = ['bird','dog','cat','cow']

builder.html {
    head {
        title 'my cool website'
        description 'this is my hello world site'
        keywords 'goovy, test, java, webdev, helloworld'
    }
    body {
        h1 'Hello World'
        p 'artisanal -ware jeans marketing corrupted BASE jump boy engine. network fluidity market office skyscraper tower tattoo -ware. drugs pen ablative papier-mache sub-orbital dome wristwatch Kowloon. futurity rebar bicycle singularity market -ware bridge tank-traps. apophenia beef noodles systemic rebar pen modem tattoo physical. rebar wonton soup receding claymore mine shoes corrupted wonton soup denim. semiotics garage soul-delay chrome vehicle post- DIY pre-. '
        section {
            h2 'cool section topic'
            table {
                animals.each { animal ->
                    tr{
                        td "$animal"
                    }
                }
            }
        }
    }
}

