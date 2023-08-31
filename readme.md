# Design Patterns

## Creational Design Patterns

### Builder pattern

it used to create complex objects step by step

### Prototype pattern

focuses on creating objects by cloning or copying existing instances known as prototypes

rather than creating objects from scatch. This method is useful when the cost of creating

a new instance of an object is relatively high and you want to avoid the overhead of initalizing

the object from scratch

## Structural Design patterns

### Adapter pattern

Used to adapt two different incompatible system

Adapter pattern also helps and be the connector between your system and some third party or legacy system

for example your system expects data in one formart to process and the 3rd party sends in one fomart

Adapter pattern can be achieved in two ways

1. Class Level: class level mean to adapt something you are extending and doing inheritance of that class.
2. Object level : Object level mean you keep has-a relationship with class rather doing tight coupling in system.

One of the example is we know java supports both array and list to store data. Now you have legacy system

which is using array and you want to use collection functionalities to do so we have to convert, so Arrays.asList work as adaper

between array to list and then use collections.

In this example we will see that Swiggy is selling food products now suddenly lockdown arise

and they thought to provide service of delivering grocery items for sometime so they write adapter which

helps them to convert similar to food item without touching their food delivery business.
