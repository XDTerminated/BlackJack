# Java Classes and Objects

### Java Classes

Java is an object-oriented programming language. Because of this, everything in Java is associated with **Classes** and **Objects**.
Classes in java have certain methods and attributes that are specific to the class. Classes can be used to create objects that have access to those methods to make something happen. 

For Example: In real life, we can say that a car is an object. It has certain attributes like **color** and **weight** and methods such as **drive** and **brake**.

### Creating A Class

We can start by creating a class by using the keyword `Class`.

```
public class Number {
  int x = 5;
}
```

****Remember: When initializing a class, the classname must start with a capital letter and it should match the file name.****

### The Main Method

A Java program needs a starting point when running. It starts executing code from the `main` method of some class. The name of the class doesn't matter, however, a Java program must always have a `main` method to begin running. Usually, the `main` method is initialized inside of the `Main` class.

We can initialize a `main` method inside of a class by doing the following.

```
public class Main {
  public static void main(String[] args) {
    // Some code...
  }
}
```

We first create a class. Then inside, we create the main method by using the line `public static void main(String[] args)`. A `main` method is always created like this, and it must always be called `main`.

### Creating An Object

Java objects are created from classes. Since we already have a Number class, we can create a Number object by going into our `main` method and creating an object by doing the following:

```
public class Main {
  public static void main(String[] args) {
    Number myNumber = new Number();
  }
}
```

We first specified the name of the class, followed by the name that we want to give to the object. Next we use the `new` followed by the name of the constructor to create a new object. 

****We can create as many objects of the class as we want!****


### Constructors

Most classes have a constructor inside that is called when creating an instance of the class.  It is a special method which sets the initial values of the attributes inside of an instance of a class. If there is no constructor initialized, the class will use its default constructor.

We can create a constructor for our number class by doing the following:
```
public class Number {
  
  int x;

  // Constructor
  public Number(int number) {
    x = number;
  }
}
```

### Methods and Attributes

Java classes can consist of many attributes and methods depending on what you want them to do.

#### Attributes

Attributes in a class are just pieces of data that associate with the class

#### Methods

Methods are blocks of code that allow an instance of a class to do certain things that when the method is called.

To create a method in a class, we can do the following:

```
public class Number {
  
  private int x; // Variables declared in a class are usually set to be private. To access them from outside the class, we can use setters and getters.

  // Constructor
  public Number(int number) {
    x = number;
  }
  
  public int addNumbers(int a) {
    return x + a;
  }
}
```

We declared a method addNumbers in our Number class by specifying the accessor, in this case public, a return type, in this case int, and the name of the function. We then specify the method name, and any parameters. Then we have a line of code inside the function that returns what x + a is. Obviously, a method can contain a lot more than one line, but in this case, one line is fine. 

In the class, `x` is an attribute that stores a number.


We can call this method in our main method like this:

```
public class Main {
  public static void main(String[] args) {
    Number myNumber = new Number(5);
    System.out.println(myNumber.addNumbers(10)); // This is how we can call a method from a class. This will return 5.
  }
}
```

### Accessors and Modifiers (Setters and Getters)

Setters and Getters are used to protect data, especially when creating classes. For each instance of a class, a getter method will return a value while the setter method set the value to something else.

By convention, setters and getter methods names are started with `set` and `get` respectively. To create a setter and getter function, we can do the following in our number class:

```
public setX(int x) {
    this.x = x; // The this keyword is generally used to refer to the current object in a method or constructor. This avoids confusion between class attributes and parameters with the same name.
}

public int getX() {
    return this.x;
}
```

### The `Static` Keyword

There are a lot of times when we don't want to create an instance of class but still want to be able to acess the methods and attributes from the class. That's where the `static` keyword comes in.

To start we create a new class and create a method inside:

```
public class StaticClass {
  public static int addNumbers(int a, int b) { 
    // The static keword tells the class that we can use this method without initializing an instance of the it.
    return a + b;
  }
}
```

In our main method, we can call this method:

```
public class Main {
  public static void main(String[] args) {
    System.out.println(StaticClass.addNumbers(a + b));
  }
}
```

### The `Abstract` And `Extends` Keyword

The `abstract` keyword in java is somewhat similar to the static keyword in that it doesn't allow you to create an instance of the class. However, in the case of an abstract class, you can only use it by inheriting the class using the `extends` keyword. 

The `extends` keyword allows you to create a child class of a parent class. The child class can then acess and `override` the methods in the parent class and access all the attributes from the parent class.

To create an abstract class, start by creating a new class and using the `abstract` keyword.

```
public abstract class AbstractClass {
  
  public static int addNumbers(int a, int b) {
    return 0;
  }
}
```

Then, to use the class, we can create a new class to extend this class.

```
public class ExtendedClass extends AbstractClass {
  @override
  public static int addNumbers(int a, int b) {
    return a + b;
  }
}
```

When we extend the class, we can override (re-write) all of the methods within to whatever we need the class to do.

****We don't have to use the @override keyword, however, it is good practice to do so to tell whoever is reading our code that the method is overriden.****



## Creating A Game

Now that you have some basic knowledge about classes, you will create a Black Jack game using the starter code provided in Blackjack.java, Player.java and Card.java files. All the steps are in the starter code.

Note: You will not be be required to make abstract and static classes and use inheritance in this project.
