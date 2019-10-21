package com.bozemantofushop

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

/*
* engine
* template
* data binding
* */


SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate( new File ('dynamic-email.txt') )

//data bindings
Map bindings = [
        first_name: "Kevin",
        last_name: "Brown",
        credits_used: 18,
        credits: [
                [name: "debit", desc: "congratulated coworker"],
                [name: "credit", desc: "cut off driver"],
                [name: "credit", desc: "yelled at a puppy"]
        ]
]

println template.make(bindings)