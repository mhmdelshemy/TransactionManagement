package com.transactionmanagement.controller;

import com.transactionmanagement.model.AccountTransaction;

import java.util.List;

public interface TransactionalController {

    AccountTransaction createTransaction(AccountTransaction accountTransaction) throws Exception;
    List<AccountTransaction> getTransactionsByAccount(List<Long> accountIds) throws Exception;
}
