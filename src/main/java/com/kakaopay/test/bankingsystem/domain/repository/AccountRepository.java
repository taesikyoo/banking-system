package com.kakaopay.test.bankingsystem.domain.repository;

import com.kakaopay.test.bankingsystem.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByToken(String token);
}
