package com.example.kotlinspring.controller

import com.example.kotlinspring.model.Fruit
import com.example.kotlinspring.repository.FruitRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class FruitsController(private val fruitRepository: FruitRepository) {
    @GetMapping("fruits")
    fun getAllFruits(): List<Fruit> =
            fruitRepository.findAll()

    @PostMapping("fruits")
    fun createNewArticle(@Valid @RequestBody fruit: Fruit): Fruit =
            fruitRepository.save(fruit)
}