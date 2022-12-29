
package com.garbulha.api.adapter.out.repository.entity

import jakarta.persistence.*

@Entity
data class AddressEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var address: String,
    @Column
    var city: String,
    @Column
    var state: String,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var userEntity: UserEntity
)
