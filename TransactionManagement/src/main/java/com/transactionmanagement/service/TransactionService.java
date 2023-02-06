package com.transactionmanagement.service;

import com.transactionmanagement.model.AccountTransaction;

import java.util.List;

public interface TransactionService {

    AccountTransaction addTransaction(AccountTransaction accountTransaction) throws Exception;
    List<AccountTransaction> getTransactionsByAccount(List<Long> accountIds);
}
