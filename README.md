# Access Modifiers Lab

## Learning Goals

- Use access modifiers to control data access

## Instructions

Create a class to represent a `Car` and a class to represent a `Garage`. The
`Garage` has a list of cars:

```java
public class Car {
}
```

```java
public class Garage {
    List cars;
}
```

Add the appropriate methods and access modifiers to make sure the list of cars
cannot be accessed directly outside the garage, but that the garage has methods
to add, remove and list the cars it has in it.

Hints:

- Make your `cars` variable `private` to make sure it doesn't get access outside
  the `Garage` class
- Create a "runner" class that will create an instance of your `Garage` class
  and add cars to it
- You will need `get`, `set` and `add` methods in your `Garage` class for your
  cars. These methods must be public
