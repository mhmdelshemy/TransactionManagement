package com.transactionmanagement.repo;

import com.transactionmanagement.model.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepo extends JpaRepository<AccountTransaction,Long> {

    @Query("FROM AccountTransaction t WHERE t.id IN (:ids)")
    List<AccountTransaction> getTransactionByAccount(@Param("ids") List<Long> accountId);
}
