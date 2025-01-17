package org.sfe.springbootsampletwo.dto;

import org.sfe.springbootsampletwo.model.Account;

import java.util.Objects;
import java.util.stream.Collectors;

public class AccountDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    private final TransactionDtoConverter transactionDtoConverter;

    public AccountDtoConverter(CustomerDtoConverter customerDtoConverter, TransactionDtoConverter transactionDtoConverter) {
        this.customerDtoConverter = customerDtoConverter;
        this.transactionDtoConverter =  transactionDtoConverter;
    }

    public AccountDto convert(Account from) {

        return new AccountDto(from.getId(), from.getBalance(), from.getCreationDate(),
                customerDtoConverter.convertToAccountCustomer(from.getCustomer()),
                Objects.requireNonNull(from.getTransactions())
                        .stream()
                        .map(transactionDtoConverter::convert)
                        .collect(Collectors.toSet()));

    }
}
