package com.bozemantofushop.service

import com.bozemantofushop.domain.Person

class PersonService implements IPersonService{
    @Override
    Person find() {
        Person p = new Person(first: 'joe', last: 'brown')
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: 'sally', last: 'brown')
        Person p2 = new Person(first: 'sue', last: 'brown')
        return [p1,p2]
    }
}
