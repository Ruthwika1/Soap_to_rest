# Spring Boot SOAP Bank Service

This project is a Spring Boot application that implements a SOAP web service for banking operations. The service allows users to create bank accounts, fetch customer information, check account balances, view recent transactions, and execute fund transfers.

## Features

- **Create Account**: Allows users to create a new bank account.
- **Get Account Details**: Fetches details of a specific bank account.
- **Check Balance**: Retrieves the current balance of a bank account.
- **Recent Transactions**: Lists recent transactions for a bank account.
- **Transfer Funds**: Executes a fund transfer between two bank accounts.

## Project Structure

```
springboot-soap-bank-service
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── bank
│   │   │               ├── BankServiceApplication.java
│   │   │               ├── config
│   │   │               │   └── WebServiceConfig.java
│   │   │               ├── endpoint
│   │   │               │   └── BankEndpoint.java
│   │   │               ├── model
│   │   │               │   ├── Account.java
│   │   │               │   ├── Customer.java
│   │   │               │   ├── Transaction.java
│   │   │               │   └── TransferRequest.java
│   │   │               └── service
│   │   │                   └── BankService.java
│   │   └── resources
│   │       ├── application.yml
│   │       └── bank.wsdl
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the Repository**: 
   ```
   git clone <repository-url>
   ```

2. **Navigate to the Project Directory**:
   ```
   cd springboot-soap-bank-service
   ```

3. **Build the Project**:
   ```
   mvn clean install
   ```

4. **Run the Application**:
   ```
   mvn spring-boot:run
   ```

5. **Access the SOAP Service**: The service will be available at `http://localhost:8080/ws`.

## Usage Examples

- **Create Account**: Send a SOAP request to create a new account.
- **Get Account Details**: Send a request to fetch details of an existing account.
- **Transfer Funds**: Send a request to transfer funds between accounts.

## Dependencies

This project uses the following dependencies:

- Spring Boot
- Spring Web Services
- JAXB
- Maven

## License

This project is licensed under the MIT License. See the LICENSE file for more details.