package com.garbulha.api.application.core.usecase

import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.out.FindAddressByZipCodeOutputPort
import com.garbulha.api.application.ports.out.InsertUserOutputPort

class InsertUserUseCase(
    var findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    var insertUserOutputPort: InsertUserOutputPort
) {

    fun insert(user: User, zipCode: String){
        val address = findAddressByZipCodeOutputPort.find(zipCode)
        user.address = address

        insertUserOutputPort.insert(user)
    }
}
