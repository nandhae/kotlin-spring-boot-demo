package com.example.kotlinspring.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "fruits")
class Fruit(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @get: NotBlank
        val name: String = ""
)
