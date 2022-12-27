package com.garbulha.api.adapter.out.repository.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id
import java.util.UUID

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