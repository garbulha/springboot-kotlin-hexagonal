package com.garbulha.api.adapter.out.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(
    name = "ConvertCurrency",
    url = "http://localhost:8080"
)
interface ConvertCurrency {

}
