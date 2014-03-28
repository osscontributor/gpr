package com.demo

import grails.transaction.Transactional

class HelloService {

    def groovyPageRenderer

    def sayHello(String name) {
        groovyPageRenderer.render template: '/hello', model: [name: name ?: 'Someone' ]

    }
}
