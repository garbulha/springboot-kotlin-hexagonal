package com.garbulha.api.application.core.usecase

import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.`in`.InsertUserInputPort
import com.garbulha.api.application.ports.out.FindAddressByZipCodeOutputPort
import com.garbulha.api.application.ports.out.InsertAddressOutputPort
import com.garbulha.api.application.ports.out.InsertUserOutputPort

class InsertUserUseCase(
        private var findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
        private var insertUserOutputPort: InsertUserOutputPort,
        private var insertAddressOutputPort: InsertAddressOutputPort
) : InsertUserInputPort {
    override fun insert(user: User, zipCode: String) {
        val address = findAddressByZipCodeOutputPort.find(zipCode)
        insertAddressOutputPort.insert(address)
        insertUserOutputPort.insert(user)
    }
}

