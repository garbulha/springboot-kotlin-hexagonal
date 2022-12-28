package com.garbulha.api.application.ports.`in`

import com.garbulha.api.application.core.domain.User

interface UpdateUserInputPort {
    fun update(user: User, zipCode: String)
}