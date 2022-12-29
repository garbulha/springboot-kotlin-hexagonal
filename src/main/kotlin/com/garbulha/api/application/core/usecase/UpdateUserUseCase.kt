package com.garbulha.api.application.core.usecase

import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.`in`.FindUserByIdInputPort
import com.garbulha.api.application.ports.`in`.UpdateUserInputPort
import com.garbulha.api.application.ports.out.FindAddressByZipCodeOutputPort
import com.garbulha.api.application.ports.out.UpdateUserOutputPort

class UpdateUserUseCase(
    private val findUserByIdInputPort: FindUserByIdInputPort,
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val updateUserOutputPort: UpdateUserOutputPort
): UpdateUserInputPort {

     override fun update(user: User, zipCode: String){
         user.id?.let { findUserByIdInputPort.find(it) }
         updateUserOutputPort.update(user)
    }
}
