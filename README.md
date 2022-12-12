# Java Classes and Objects

### Java Classes

Java is an object-oriented programming language. Because of this, everything in Java is associated with **Classes** and **Objects**.
Classes in java have certain methods and attributes that are specific to the class. Classes can be used to create objects that have access to those methods to make something happen. 

For Example: In real life, we can say that a car is an object. It has certain attributes like **color** and **weight** and methods such as **drive** and **brake**.

### Creating A Class

We can start by creating a class by using the keyword `Class`.

```
public Class Number {
  int x = 5;
}
```

****Remember: When initializing a class, the classname must start with a capital letter and it should match the file name.****

### The Main Method

A Java program needs a starting point when running. It starts executing code from the `main` method of some class. The name of the class doesn't matter, however, a Java program must always have a `main` method to begin running. Usually, the `main` method is initialized inside of the `Main` class.

We can initialize a `main` method inside of a class by doing the following.

```
public Class Main {
  public static void main(String[] args) {
    // Some code...
  }
}
```

We first create a class. Then inside, we create the main method by using the line `public static void main(String[] args)`. A `main` method is always created like this, and it must always be called `main`.

### Creating An Object

Java objects are created from classes. Since we already have a Number class, we can create a Number object by going into our `main` method and creating an object by doing the following:

```
public Class Main {
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
public Class Number {
  
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
public Class Number {
  
  int x;

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
