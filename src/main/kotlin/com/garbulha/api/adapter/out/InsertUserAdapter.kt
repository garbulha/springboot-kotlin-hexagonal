package com.garbulha.api.adapter.out

import com.garbulha.api.adapter.out.repository.UserRepository
import com.garbulha.api.adapter.out.repository.mapper.UserEntityMapper
import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.out.InsertUserOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class InsertUserAdapter: InsertUserOutputPort {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var mapper: UserEntityMapper

    override fun insert(user: User) {
        userRepository.save(mapper.toUserEntity(user))
    }
}