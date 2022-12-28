package com.garbulha.api.adapter.out.repository.entity

import com.garbulha.api.application.core.domain.Address
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity(name = "TB_USER")
data class UserEntity (
    @Id
    var id: Int,
    @Column(nullable = false)
    var name:  String,
    @Column(nullable = false)
    var cpf: String,
    @Column(nullable = false)
    @OneToMany
    var addresses: List<AddressEntity>,
    @Column(nullable = false)
    var isValid: Boolean
)