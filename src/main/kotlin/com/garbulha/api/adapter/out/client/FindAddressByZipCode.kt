package com.garbulha.api.adapter.out.client

import com.garbulha.api.adapter.out.client.reponse.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressByZipCode",
    url = "https://63acf1afda81ba97618fae59.mockapi.io/"
)

interface FindAddressByZipCode {
    @GetMapping("/address/{zipCode}")
    fun find(@PathVariable("zipCode") zipCode: String) : AddressResponse
}
