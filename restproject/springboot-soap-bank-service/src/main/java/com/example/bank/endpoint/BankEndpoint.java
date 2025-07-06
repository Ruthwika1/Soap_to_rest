package com.example.bank.endpoint;

import com.example.bank.model.Account;
import com.example.bank.model.Customer;
import com.example.bank.model.TransferRequest;
import com.example.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BankEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/bank";

    @Autowired
    private BankService bankService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateAccountRequest")
    @ResponsePayload
    public Account createAccount(@RequestPayload CreateAccountRequest request) {
        return bankService.createAccount(request.getCustomerId(), request.getInitialBalance());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAccountDetailsRequest")
    @ResponsePayload
    public Account getAccountDetails(@RequestPayload GetAccountDetailsRequest request) {
        return bankService.getAccountDetails(request.getAccountNumber());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TransferFundsRequest")
    @ResponsePayload
    public TransferResponse transferFunds(@RequestPayload TransferRequest request) {
        return bankService.transferFunds(request.getFromAccount(), request.getToAccount(), request.getAmount());
    }
}