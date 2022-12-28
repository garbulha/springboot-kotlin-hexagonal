package com.garbulha.api.adapter.out

import com.garbulha.api.adapter.`in`.controller.mapper.UserMapper
import com.garbulha.api.adapter.out.repository.UserRepository
import com.garbulha.api.adapter.out.repository.entity.UserEntity
import com.garbulha.api.adapter.out.repository.mapper.UserEntityMapper
import com.garbulha.api.application.core.domain.User
import com.garbulha.api.application.ports.out.FindUserByIdOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class FindUserByIdAdapter : FindUserByIdOutputPort {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var userMapper: UserEntityMapper

    override fun find(id: Int): Optional<User> =
        userRepository.findById(id).map { userMapper.toUser(it) }

}