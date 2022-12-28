package com.garbulha.api.config

import com.garbulha.api.adapter.out.FindAddressByZipCodeAdapter
import com.garbulha.api.adapter.out.InsertUserAdapter
import com.garbulha.api.application.core.usecase.InsertUserUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertUserConfig {

    @Bean
    fun insertUserUseCase(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertUserAdapter: InsertUserAdapter
    ): InsertUserUseCase = InsertUserUseCase(findAddressByZipCodeAdapter, insertUserAdapter)
}