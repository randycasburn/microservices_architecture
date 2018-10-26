# Microservices Architecture

## Minimal architecture using:

- Spring Boot
- Eureka
- Zuul (Ribbon automagically)

##### NOT used (yet?)

- [ ] _Fault tolerance (circuit breakers) (using Hystrix)_
- [ ] _Service to service via Feign_

#### This solution includes four individual Spring-Boot applicatons:
- Eureka Registration Server
- Zuul Router and Filter
- Category
- Product

 ![Architecture](/architecture.jpeg)

## Notes:

Current solution is written against a MySQL datbase. I haven't provided the SQL to generate that data. I will provide an H2 solution.

## How To:

1. Start the registration server first
1. Start the Zuul server second
1. Start any other microservices
   1. File-copy category or product (or both) microservice
   1. Change **only** the port number to an unused port
   1. Launch copied services
   1. Be amazed by simple client-side load balancing
