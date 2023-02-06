package com.transactionmanagement.controller.impl;

import com.transactionmanagement.controller.TransactionalController;
import com.transactionmanagement.model.AccountTransaction;
import com.transactionmanagement.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/transaction-management/")
public class TransactionalControllerImpl implements TransactionalController {

    private final TransactionService transactionService;

    @PostMapping("create-transaction")
    @ResponseStatus(value = HttpStatus.CREATED)
    public AccountTransaction createTransaction(@RequestBody @Valid AccountTransaction accountTransaction) throws Exception {
        return transactionService.addTransaction(accountTransaction);
    }

    @PostMapping("get-transaction")
    @ResponseStatus(value = HttpStatus.OK)
    public List<AccountTransaction> getTransactionsByAccount(@RequestBody @NotNull List<Long> accountIds){
        return transactionService.getTransactionsByAccount(accountIds);
    }
}
