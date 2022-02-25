package ru.bft.service.rest
import com.github.demidko.aot.WordformMeaning.lookupForMeanings

import org.springframework.stereotype.Component
@Component
class WordService {
    fun spell (word:String):List<String>{
        val words = mutableListOf<String>()
        val meanings = lookupForMeanings(word)
        for (i in 0..5){
            words.add(meanings.get(0).getTransformations().get(i).toString())
        }
        return words
    }
}