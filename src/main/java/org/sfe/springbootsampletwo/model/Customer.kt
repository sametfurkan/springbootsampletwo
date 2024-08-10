package org.sfe.springbootsampletwo.model

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator

@Entity
class Customer(

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    val id: String?,
    val name: String?,
    val surname: String?,

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    val accounts: Set<Account>?
) {
}
