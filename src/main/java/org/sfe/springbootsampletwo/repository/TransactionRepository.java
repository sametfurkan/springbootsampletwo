package org.sfe.springbootsampletwo.repository;

import org.sfe.springbootsampletwo.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
