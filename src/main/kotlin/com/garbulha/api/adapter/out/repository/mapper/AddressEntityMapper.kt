package com.garbulha.api.adapter.out.repository.mapper

import com.garbulha.api.adapter.out.repository.entity.AddressEntity
import com.garbulha.api.adapter.out.repository.entity.UserEntity
import com.garbulha.api.application.core.domain.Address
import com.garbulha.api.application.core.domain.User
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AddressEntityMapper {
    fun toAddressEntity(address: Address): AddressEntity
}
