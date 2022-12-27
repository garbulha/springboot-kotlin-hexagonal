package com.garbulha.api.adapter.out

import com.garbulha.api.adapter.out.client.FindAddressByZipCode
import com.garbulha.api.adapter.out.client.mapper.AddressMapper
import com.garbulha.api.application.core.domain.Address
import com.garbulha.api.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter : FindAddressByZipCodeOutputPort{

    @Autowired
    private lateinit var findAddress: FindAddressByZipCode

    @Autowired
    private lateinit var addressMapper: AddressMapper

    override fun find(zipCode: String): Address =
        addressMapper.toAddress(findAddress.find(zipCode))


}
