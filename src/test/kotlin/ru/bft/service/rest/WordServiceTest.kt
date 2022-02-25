package ru.bft.service.rest

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WordServiceTest{
    @Test
    fun spellTest(){
        val list = listOf<String>("дерево", "дерева", "дереву","дерево","деревом","дереве")
        Assertions.assertEquals(WordService().spell("дерево"),list)
    }
}