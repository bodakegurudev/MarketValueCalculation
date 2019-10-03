package com.bjb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bjb.dto.Account;

@Repository
public interface AccountServiceRepository extends JpaRepository<Account, Long>{

}
