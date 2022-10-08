package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 6.10.2022
 **/

/*
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it,
it must be inherited from another class).

1) Extending Abstract classes: can only be used in an abstract class,
and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

2) Immplementing Interfaces:

Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

To access the interface methods,
the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends).
The body of the interface method is provided by the "implement" class:

*/

// Interface:
interface Animal {
  // Abstract method (does not have a body)
  public void animalSound();
  // Regular method
  public void sleep();

}
