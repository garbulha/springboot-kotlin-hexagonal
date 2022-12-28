package com.garbulha.api.adapter.out.repository.mapper

import com.garbulha.api.adapter.out.repository.entity.UserEntity
import com.garbulha.api.application.core.domain.User
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserEntityMapper {

    fun toUserEntity(user: User): UserEntity

    fun toUser(userEntity: UserEntity): User
}
