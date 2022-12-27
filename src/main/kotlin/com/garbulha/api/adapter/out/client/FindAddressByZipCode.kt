package com.garbulha.api.adapter.out.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressByZipCode",
    url = "\${api.address.url_base}"
)
interface FindAddressByZipCode {
    @GetMapping("/{:zipCode}")
    fun find(@PathVariable("zipCode") zipCode: String)
}