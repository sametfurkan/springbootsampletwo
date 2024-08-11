package org.sfe.springbootsampletwo.repository;

import org.sfe.springbootsampletwo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
