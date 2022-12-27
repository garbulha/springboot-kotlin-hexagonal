package com.garbulha.api.application.ports.out

import com.garbulha.api.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {
     fun find(zipCode: String): Address
}