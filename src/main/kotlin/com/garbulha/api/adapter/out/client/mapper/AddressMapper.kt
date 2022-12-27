package com.garbulha.api.adapter.out.client.mapper

import com.garbulha.api.adapter.out.client.reponse.AddressResponse
import com.garbulha.api.application.core.domain.Address
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AddressMapper {
    fun toAddress(addressResponse: AddressResponse): Address
}
