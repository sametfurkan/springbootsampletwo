package org.sfe.springbootsampletwo.repository;

import org.sfe.springbootsampletwo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
