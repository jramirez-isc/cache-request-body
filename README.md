# cache-request-body

***Available endpoints***
-
- GET localhost:8083/employees -> Get all employees
- POST localhost:8083/employees -> Create new employees
```
{
"name": "Ricardo",
"salary": 20000
}
```
Console:
```
2022-07-22 13:19:44.903  INFO 82519 --- [nio-8083-exec-2] c.j.c.filter.CachingRequestBodyFilter    : caching request
2022-07-22 13:19:44.923  INFO 82519 --- [nio-8083-exec-2] c.j.c.filter.CachingRequestBodyFilter    : Employee inside the filter {
    "name": "Ricardo",
    "salary": 20000
}
2022-07-22 13:19:44.934  INFO 82519 --- [nio-8083-exec-2] c.j.c.filter.RandomInterceptor           : Intercepted Employee{
    "name": "Ricardo",
    "salary": 20000
}
2022-07-22 13:19:45.006  INFO 82519 --- [nio-8083-exec-2] c.j.c.controller.EmployeeController      : Employee(name=Ricardo, salary=20000.0)
```

