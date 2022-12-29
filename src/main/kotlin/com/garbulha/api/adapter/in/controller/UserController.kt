package com.garbulha.api.adapter.`in`.controller

import com.garbulha.api.adapter.`in`.controller.mapper.UserMapper
import com.garbulha.api.adapter.`in`.controller.request.UserRequest
import com.garbulha.api.adapter.`in`.controller.response.UserResponse
import com.garbulha.api.application.ports.`in`.FindUserByIdInputPort
import com.garbulha.api.application.ports.`in`.InsertUserInputPort
import com.garbulha.api.application.ports.`in`.UpdateUserInputPort
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/user")
class UserController {

    @Autowired
    private lateinit var insertUserInputPort: InsertUserInputPort

    @Autowired
    private lateinit var userMapper: UserMapper

    @Autowired
    private lateinit var findUserByIdInputPort: FindUserByIdInputPort

    @Autowired
    private lateinit var updateUserInputPort: UpdateUserInputPort

    @PostMapping
    fun save(@Valid @RequestBody userRequest: UserRequest): ResponseEntity<String>{
        insertUserInputPort.insert(userMapper.toUser(userRequest), userRequest.zipCode)
        return ResponseEntity.ok().build()
    }

    @GetMapping("/{:id}")
    fun getById(@PathVariable id: String): ResponseEntity<UserResponse>{
        val user = findUserByIdInputPort.find(id)
        return ResponseEntity.ok().body(userMapper.toUserResponse(user))
    }

    @PutMapping("/{:id}")
    fun update(@PathVariable id: String, @Valid @RequestBody userRequest: UserRequest): ResponseEntity<Void>{
        val user = userMapper.toUser(userRequest)
        user.id = id
        updateUserInputPort.update(user, userRequest.zipCode)
        return ResponseEntity.noContent().build()
    }

}
