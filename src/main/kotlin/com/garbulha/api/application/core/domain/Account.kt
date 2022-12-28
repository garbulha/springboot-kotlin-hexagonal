package com.garbulha.api.application.core.domain

import java.math.BigDecimal

data class Account (
    var id: Int,
    var type: String,
    var balance: BigDecimal,
    var user: User

)