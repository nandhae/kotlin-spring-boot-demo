package com.example.kotlinspring.repository

import com.example.kotlinspring.model.Fruit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FruitRepository : JpaRepository<Fruit, Int>