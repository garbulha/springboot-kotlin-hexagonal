package com.garbulha.api.adapter.`in`.controller

import com.garbulha.api.adapter.`in`.controller.mapper.UserMapper
import com.garbulha.api.adapter.`in`.controller.request.UserRequest
import com.garbulha.api.adapter.`in`.controller.response.UserResponse
import com.garbulha.api.application.ports.`in`.FindUserByIdInputPort
import com.garbulha.api.application.ports.`in`.InsertUserInputPort
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/user")
class UserController {

    @Autowired
    private lateinit var insertUserInputPort: InsertUserInputPort

    @Autowired
    private lateinit var userMapper: UserMapper

    @Autowired
    private lateinit var findUserByIdInputPort: FindUserByIdInputPort

    @PostMapping
    fun save(@Valid @RequestBody userRequest: UserRequest): ResponseEntity<String>{
        insertUserInputPort.insert(userMapper.toUser(userRequest), userRequest.zipCode)
        return ResponseEntity.ok().build()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): ResponseEntity<UserResponse>{
        val user = findUserByIdInputPort.find(id)
        return ResponseEntity.ok().body(userMapper.toUserResponse(user))
    }

}
