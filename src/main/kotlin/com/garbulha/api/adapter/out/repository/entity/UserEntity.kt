package com.garbulha.api.adapter.out.repository.entity

import com.garbulha.api.application.core.domain.Address
import jakarta.persistence.Column
import jakarta.persistence.Entity
import org.springframework.data.annotation.Id
import java.util.UUID

@Entity(name = "TB_USER")
data class UserEntity (
    @Id
    var id: Int,
    @Column(nullable = false)
    var name:  String,
    @Column(nullable = false)
    var cpf: String,
    @Column(nullable = false)
    var address: Address,
    @Column(nullable = false)
    var isValid: Boolean
)