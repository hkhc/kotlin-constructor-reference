package io.hkhc

class Factory {

    fun create(cstr: ()->Person): Person {
        return cstr();
    }

}