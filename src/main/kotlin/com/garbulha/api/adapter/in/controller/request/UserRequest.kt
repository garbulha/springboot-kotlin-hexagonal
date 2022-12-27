package com.garbulha.api.adapter.`in`.controller.request

import org.jetbrains.annotations.NotNull

data class UserRequest (
    @field:NotNull
    var name: String,
    @field:NotNull
    var cpf: String,
    @field:NotNull
    var zipCode: String
)
