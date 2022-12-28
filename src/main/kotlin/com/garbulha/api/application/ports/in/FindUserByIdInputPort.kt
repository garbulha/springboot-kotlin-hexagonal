package com.garbulha.api.application.ports.`in`

import com.garbulha.api.application.core.domain.User

interface FindUserByIdInputPort {
    fun find(id: String): User
}