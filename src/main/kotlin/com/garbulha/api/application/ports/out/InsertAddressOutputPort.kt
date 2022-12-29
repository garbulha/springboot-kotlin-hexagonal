package com.garbulha.api.application.ports.out

import com.garbulha.api.application.core.domain.Address

interface InsertAddressOutputPort {
    fun insert(address: Address)
}