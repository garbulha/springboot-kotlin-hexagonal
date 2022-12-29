package com.garbulha.api.adapter.out

import com.garbulha.api.adapter.out.repository.AddressRepository
import com.garbulha.api.adapter.out.repository.mapper.AddressEntityMapper
import com.garbulha.api.application.core.domain.Address
import com.garbulha.api.application.ports.out.InsertAddressOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class InsertAddressAdapter: InsertAddressOutputPort {

    @Autowired
    private lateinit var addressRepository: AddressRepository

    @Autowired
    private lateinit var mapper: AddressEntityMapper


    override fun insert(address: Address) {
        addressRepository.save(mapper.toAddressEntity(address))
    }
}