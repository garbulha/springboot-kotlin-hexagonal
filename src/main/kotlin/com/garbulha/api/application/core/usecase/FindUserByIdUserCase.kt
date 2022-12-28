package com.garbulha.api.application.core.usecase

import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.`in`.FindUserByIdInputPort
import com.garbulha.api.application.ports.out.FindUserByIdOutputPort

class FindUserByIdUserCase(var findUserByIdOutputPort: FindUserByIdOutputPort): FindUserByIdInputPort {

    override fun find(id: String): User {
        return findUserByIdOutputPort.find(id).orElseThrow{ RuntimeException("User not Found") }
    }
}
