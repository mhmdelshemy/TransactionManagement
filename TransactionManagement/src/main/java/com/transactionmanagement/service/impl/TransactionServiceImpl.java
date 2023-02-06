package com.transactionmanagement.service.impl;

import com.transactionmanagement.model.AccountTransaction;
import com.transactionmanagement.repo.TransactionRepo;
import com.transactionmanagement.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {


    private final TransactionRepo transactionRepo;

    @Override
    public AccountTransaction addTransaction(AccountTransaction accountTransaction) throws Exception {
        accountTransaction.setCreated(Instant.now());
       return transactionRepo.save(accountTransaction);
    }

    @Override
    public List<AccountTransaction> getTransactionsByAccount(List<Long> accountIds) {
        return transactionRepo.getTransactionByAccount(accountIds);
    }
}
