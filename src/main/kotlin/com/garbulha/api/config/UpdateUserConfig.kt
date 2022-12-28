package com.garbulha.api.config

import com.garbulha.api.adapter.out.FindAddressByZipCodeAdapter
import com.garbulha.api.adapter.out.FindUserByIdAdapter
import com.garbulha.api.adapter.out.UpdateUserAdapter
import com.garbulha.api.application.core.usecase.FindUserByIdUserCase
import com.garbulha.api.application.core.usecase.UpdateUserUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateUserConfig {

    @Bean
    fun updateUserUseCase(
        findUserByIdUserCase: FindUserByIdUserCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateUserAdapter: UpdateUserAdapter
    ): UpdateUserUseCase = UpdateUserUseCase(findUserByIdUserCase, findAddressByZipCodeAdapter, updateUserAdapter)
}
