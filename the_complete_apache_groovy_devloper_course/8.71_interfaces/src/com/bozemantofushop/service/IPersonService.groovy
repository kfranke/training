package com.bozemantofushop.service

import com.bozemantofushop.domain.Person

interface IPersonService {

        Person find()
        List<Person> findAll()
}