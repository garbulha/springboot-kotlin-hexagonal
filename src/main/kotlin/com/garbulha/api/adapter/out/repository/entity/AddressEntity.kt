package com.garbulha.api.adapter.out.repository.entity

import jakarta.persistence.*

@Entity(name = "TB_ADDRESS")
data class AddressEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @Column(nullable = false)
    var address: String,
    @Column(nullable = false)
    var city: String,
    @Column(nullable = false)
    var state: String
)