package com.garbulha.api.application.ports.`in`

import com.garbulha.api.application.core.domain.User

interface InsertUserInputPort {
    fun insert(user: User, zipCode: String)
}
