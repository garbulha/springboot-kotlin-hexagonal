package com.garbulha.api.application.core.domain

import java.util.UUID

data class User(
    var name:  String,
    var cpf: String,
    var address: Address,
    var isValid: Boolean = false
)

data class Address(
    var address: String,
    var city: String,
    var state: String
)
