package com.garbulha.api.adapter.`in`.controller.response

import com.garbulha.api.application.core.domain.Address

data class UserResponse (
    var name:  String,
    var cpf: String,
    var address: Address,
    var isValid: Boolean = false
)

data class AddressResponse(
    var address: String,
    var city: String,
    var state: String
)
