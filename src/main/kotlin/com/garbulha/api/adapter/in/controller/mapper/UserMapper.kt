package com.garbulha.api.adapter.`in`.controller.mapper

import com.garbulha.api.adapter.`in`.controller.request.UserRequest
import com.garbulha.api.adapter.`in`.controller.response.UserResponse
import com.garbulha.api.application.core.domain.User
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.springframework.data.jpa.domain.AbstractPersistable_.id

@Mapper(componentModel = "spring")
interface UserMapper {
    @Mappings(
        Mapping(target = "id", ignore = true),
        Mapping(target = "address", ignore = true),
        Mapping(target = "isValid", ignore = true),
        Mapping(target = "address", ignore = true)
    )
    fun toUser(userRequest: UserRequest) : User

    @Mapping(target = "id", ignore = true)
    fun toUserResponse(user: User): UserResponse
}
