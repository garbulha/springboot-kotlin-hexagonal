package com.garbulha.api.application.core.domain

import java.util.UUID

data class User(
    var id: UUID,
    var name:  String,
    var cpf: String,
    var isValid: Boolean = false
)

data class Address(
    var id: UUID,
    var address: String,
    var city: String,
    var state: String
)
