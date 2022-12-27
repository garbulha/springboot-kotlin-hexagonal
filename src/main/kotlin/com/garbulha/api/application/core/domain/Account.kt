package com.garbulha.api.application.core.domain

import java.math.BigDecimal
import java.util.UUID

data class Account (
    var id: UUID,
    var type: String,
    var balance: BigDecimal,
    var user: User

)