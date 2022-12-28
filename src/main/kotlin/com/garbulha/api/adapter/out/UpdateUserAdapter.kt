package com.garbulha.api.adapter.out

import com.garbulha.api.adapter.out.repository.UserRepository
import com.garbulha.api.adapter.out.repository.mapper.UserEntityMapper
import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.out.UpdateUserOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UpdateUserAdapter: UpdateUserOutputPort {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var userEntityMapper: UserEntityMapper

    override fun update(user: User) {
        userRepository.save(userEntityMapper.toUserEntity(user))
    }
}