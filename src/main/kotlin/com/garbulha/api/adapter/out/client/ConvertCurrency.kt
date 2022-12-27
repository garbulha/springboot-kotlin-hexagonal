package com.garbulha.api.adapter.out.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.openfeign.FeignClient

@FeignClient(
    name = "ConvertCurrency",
    url = "\${api.currency.base_url}"
)
interface ConvertCurrency {

}