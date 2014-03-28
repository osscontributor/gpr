package com.demo

class DemoController {

    def helloService

    def index(String name) { 
        render helloService.sayHello(name)
    }
}
