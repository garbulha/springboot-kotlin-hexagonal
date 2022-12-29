package com.garbulha.api.application.core.domain


data class User(
    var id: String? = null,
    var name:  String,
    var cpf: String,
    var isValid: Boolean? = false
)

data class Address(
    var id: String? = null,
    var address: String,
    var city: String,
    var state: String,
    var user: User? = null
)
