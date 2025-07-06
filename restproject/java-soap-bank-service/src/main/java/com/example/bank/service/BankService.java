package com.example.bank.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BankService {

    @WebMethod
    String createAccount(String customerId, String accountType);

    @WebMethod
    String getAccountDetails(String accountNumber);

    @WebMethod
    String transferFunds(String fromAccount, String toAccount, double amount);
}