package com.bozemantofushop

// just a kinda different way to instanciate an object
Person p = Person
    .builder()
    .first("kevin")
    .last("brown")
    .middle("timmy")
    .hireon(new Date())
    .email("kb@email.com")
    .languagues(["php","javascript"])
    .build()

println p


