# Java Runtime Proxy Pattern

A simple Java example demonstrating the **Runtime Proxy Design Pattern** using Java Reflection and the `InvocationHandler` interface.

## Concepts Covered

- Runtime proxy creation using `Proxy.newProxyInstance()`
- `InvocationHandler` and its `invoke()` method
- Reflection using `Method.invoke()`
- Intercepting method calls
- Working with multiple implementations of the same interface

## Project Structure

```text
src/
└── Main.java
```

## How It Works

1. `Radio` defines the common interface.
2. `FMRadio` and `InternetRadio` provide different implementations.
3. `RadioHandler` implements `InvocationHandler` to intercept method calls.
4. `Proxy.newProxyInstance()` creates a proxy object at runtime.
5. Calling `proxyRadio.play()` invokes the handler, which executes the actual radio method.

## Execution Flow

```text
proxyRadio.play()
       |
       v
RadioHandler.invoke()
       |
       v
Print "Before playing"
       |
       v
method.invoke(target, args)
       |
       v
FMRadio.play()
       |
       v
Print "After playing"
```

## Sample Output

```text
Before playing
Playing FM radio
After playing
```

## Technologies Used

- Java
- Java Reflection API
- Dynamic Proxy API

## Connection to Spring

Spring uses proxy-based mechanisms for features such as AOP and transaction management. Spring Data JPA also creates repository proxies to provide repository behavior without requiring you to implement every repository method manually.

**Note:** Spring's proxy infrastructure is more sophisticated than this basic Java example and may use different interception mechanisms.
