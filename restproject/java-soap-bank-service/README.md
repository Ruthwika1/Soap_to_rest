# Java SOAP Bank Service

This project implements a SOAP web service for a banking application. The service provides operations for creating bank accounts, retrieving account details, and transferring funds between accounts.

## Project Structure

```
java-soap-bank-service
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── bank
│   │   │               ├── service
│   │   │               │   ├── BankService.java
│   │   │               │   └── BankServiceImpl.java
│   │   │               ├── model
│   │   │               │   ├── Account.java
│   │   │               │   ├── Customer.java
│   │   │               │   └── Transaction.java
│   │   │               └── util
│   │   │                   └── SoapHeaderHandler.java
│   │   └── resources
│   │       └── bankservice.wsdl
├── pom.xml
└── README.md
```

## Operations

### CreateAccount
- **Description**: Creates a new bank account.
- **Input**: Customer information and account details.
- **Output**: Confirmation of account creation.

### GetAccountDetails
- **Description**: Fetches details of a bank account.
- **Input**: Account number.
- **Output**: Customer information, account balance, and recent transactions.

### TransferFunds
- **Description**: Transfers funds between two bank accounts.
- **Input**: Source account number, destination account number, and transfer amount.
- **Output**: Confirmation of the fund transfer.

## Building the Project

To build the project, ensure you have Maven installed and run the following command in the project root directory:

```
mvn clean install
```

## Running the Service

After building the project, you can run the SOAP service using a Java application server or a standalone Java application. Ensure that the WSDL file is correctly configured for the service.

## Dependencies

This project uses Maven for dependency management. The `pom.xml` file contains all necessary dependencies for the SOAP service implementation.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.