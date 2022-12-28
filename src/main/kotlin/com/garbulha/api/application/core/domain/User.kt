package com.garbulha.api.application.core.domain


data class User(
    var id: String,
    var name:  String,
    var cpf: String,
    var address: Address,
    var isValid: Boolean = false
)

data class Address(
    var id: String,
    var address: String,
    var city: String,
    var state: String
)
