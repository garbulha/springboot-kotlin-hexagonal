package com.garbulha.api.application.ports.out

import com.garbulha.api.application.core.domain.User
import java.util.*

interface FindUserByIdOutputPort {
    fun find(id: String): Optional<User>
}