package com.bftcom.service

import com.bftcom.service.services.WordService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class WordServiceTest{
    @Autowired
    lateinit var service:WordService

    @Test
    open fun spellTest(){

        val list = listOf<String>("дерево", "дерева", "дереву","дерево","деревом","дереве")
        Assertions.assertEquals(list,service.spell("дерево"))
    }

}