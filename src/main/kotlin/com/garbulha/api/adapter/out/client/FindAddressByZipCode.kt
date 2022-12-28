package com.garbulha.api.adapter.out.client

import com.garbulha.api.adapter.out.client.reponse.AddressResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressByZipCode",
    url = "http://localhost/test"
)

interface FindAddressByZipCode {
    @GetMapping("/{:zipCode}")
    fun find(@PathVariable("zipCode") zipCode: String) : AddressResponse
}
