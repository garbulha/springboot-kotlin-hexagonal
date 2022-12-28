package com.garbulha.api.application.ports.out

import com.garbulha.api.application.core.domain.User

interface UpdateUserOutputPort {
    fun update(user: User)
}