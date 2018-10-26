# Microservices Architecture

## Minimal architecture using:

- Spring Boot
- Eureka
- Zuul (Ribbon automagically)

##### NOT used (yet?)

- _Fault tolerance (circuit breakers) (using Hystrix)_
- _Service to service via Feign_

#### This solution includes four individual Spring-Boot applicatons:
- Eureka Registration Server
- Zuul Router and Filter
- Category
- Product

 ![Architecture](https://github.com/randycasburn/microservices_architecture)

## Notes:

Current solution is written against a MySQL datbase. I haven't provided the SQL to generate that data. I will provide an H2 solution.

## How To:

1. Start the registration server first
2. Start the Zuul server second
3. Start any other microservices
