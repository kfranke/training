package com.bozemantofushop

import groovy.time.TimeCategory

use(TimeCategory){

    println 5.minute.from.now
    println 10.hours.ago

    def someDate = new Date()
    println someDate - 3.months
}
