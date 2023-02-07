# Payday Trade Ms project

## <mark> Basic information about the project: </mark> 
### 1. Architecture: Microservice
### 2. Approach: Multi-Module 
### 3. Language: Java vesion: 11
### 4. Build Tool: Gradle
### 4. Framework: Spring Boot
### 5. Testing: JUNIT, MOCKITO

</br>
</br>

## <mark> Tasks are done : </mark>

### 1. LIST STOCKS  

### 2. DEPOSIT CASH

### 3. EMAIL NOTIFICATION

</br>
</br>

## <mark> Microservices created for the project : </mark>

### 1. **stock-mock-source-ms**
    1. Purpose: mock microservice for simulating the stock price flactuation.
    2. Mock definition of a Stock: id, name, price.
    3. Dependendant on 'list-stock-ms' for 'Stocks' class and 'StocksRepository'
    4. Automated docker create, build, push 

### 2. **list-stock-ms**
    1. Purpose: microservice for listing the available stocks. 
    2. Tests are done for Controller and Serivce
    3. Automated docker create, build, push 

### 3. **deposit-cash-ms**
    1. Purpose: microservice for a user to deposit cash into his/her account.
    2. Automated docker create, build, push 

### 4. **notification-ms**
    1. Purpose: microservice for sending an email notification when order is filled
    2. Has configuration for Kafka and Mail sending
    3. Has consumer class for consuming (sending email notification to user about purchase of stock)
    4. Automated docker create, build, push 

### 5. **user-order-ms**
    purpose: microservice for handling the user order for buy or sell stocks
    Not finished.

</br>
</br>

## <mark> Libraries created for the project : </mark>

### 1. **common**
    puspose: common functionality for exception handling.

</br>
</br>

## <mark> Other Technologies used for building the project : </mark> 
### 1. Docker 
### 1. MySQL
### 2. Kafka
