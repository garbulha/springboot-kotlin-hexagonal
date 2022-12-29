package com.garbulha.api.adapter.out.repository.entity

import jakarta.persistence.*

@Entity
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    var name:  String,

    @Column(nullable = false)
    var cpf: String,

    @Column(nullable = false)
    var isValid: Boolean
)
