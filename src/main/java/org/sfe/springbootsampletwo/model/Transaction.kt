package org.sfe.springbootsampletwo.model

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
data class Transaction(
    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    val id: String?,
    val transactionType: TransactionType? = TransactionType.INITIAL,
    val amount: BigDecimal?,
    val transactionDate: LocalDateTime?,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    val account: Account?
){

}

enum class TransactionType {
    INITIAL,
    TRANSFER

}
