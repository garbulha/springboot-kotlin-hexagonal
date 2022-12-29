package com.garbulha.api.adapter.out.repository

import com.garbulha.api.adapter.out.repository.entity.AddressEntity
import com.garbulha.api.adapter.out.repository.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository: JpaRepository<AddressEntity, String> {
}
