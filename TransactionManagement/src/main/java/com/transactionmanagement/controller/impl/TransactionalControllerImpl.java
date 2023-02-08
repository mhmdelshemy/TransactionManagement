package com.transactionmanagement.controller.impl;

import com.transactionmanagement.constant.ApiConstant;
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
@RequestMapping(ApiConstant.TRANSACTION_MANAGEMENT_MAPPING)
public class TransactionalControllerImpl implements TransactionalController {

    private final TransactionService transactionService;

    @PostMapping(ApiConstant.CREATE_TRANSACTION_MAPPING)
    @ResponseStatus(value = HttpStatus.CREATED)
    public AccountTransaction createTransaction(@RequestBody @Valid AccountTransaction accountTransaction) throws Exception {
        return transactionService.addTransaction(accountTransaction);
    }

    @PostMapping(ApiConstant.GET_TRANSACTION_MAPPING)
    @ResponseStatus(value = HttpStatus.OK)
    public List<AccountTransaction> getTransactionsByAccount(@RequestBody @NotNull List<Long> accountIds){
        return transactionService.getTransactionsByAccount(accountIds);
    }
}
