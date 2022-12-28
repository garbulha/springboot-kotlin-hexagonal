package com.garbulha.api.config

import com.garbulha.api.adapter.out.FindUserByIdAdapter
import com.garbulha.api.application.core.usecase.FindUserByIdUserCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindUserByIdConfig {

    @Bean
    fun findUserByIdUseCase(findUserByIdAdapter: FindUserByIdAdapter) = FindUserByIdUserCase(findUserByIdAdapter)

}