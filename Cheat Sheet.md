# Cheat Sheet

## Java

### Basics

#### Comments

Single-line comments start with two forward slashes (//).
Any text between // and the end of the line is ignored by Java (will not be executed).

``` java
// This is a comment
```

Multi-line comments start with /* and ends with \*/.
Any text between /* and */ will be ignored by Java.

#### The main Method

The main() method is required and you will see it in every Java program.

``` java
public static void main(String[] args) {
    // block of code to be executed
}
```

#### The Println() Method

We can use the println() method to print a line of text to the screen.
You can add as many println() methods as you want. Note that it will add a new line for each method.

``` java
System.out.println("Hello World");
```

#### The Print() Method

There is also a print() method, which is similar to println().
The only difference is that it does not insert a new line at the end of the output.

``` java
System.out.print("Hello World! ");
```

#### User Input

In the example, we used the nextLine() method, which is used to read Strings.

- nextBoolean()	Reads a boolean value from the user
- nextDouble()	Reads a double value from the user
- nextFloat()	Reads a float value from the user
- nextInt()	    Reads a int value from the user
- nextLine()	Reads a String value from the user
- nextLong()	Reads a long value from the user

``` java
import java.util.Scanner;  // Import the Scanner class

Scanner myObj = new Scanner(System.in);  // Create a Scanner object
String userName = myObj.nextLine();  // Read user input
```

### Conditions

#### The if Statement

Use the if statement to specify a block of Java code to be executed if a condition is true.

``` java
if (condition) {
    // block of code to be executed if the condition is true
}
```

#### The else Statement

Use the else statement to specify a block of code to be executed if the condition is false.

``` java
if (condition) {
    // block of code to be executed if the condition is true
} else {
    // block of code to be executed if the condition is false
}
```

#### The else if Statement

Use the else if statement to specify a new condition if the first condition is false.

``` java
if (condition1) {
    // block of code to be executed if condition1 is true
} else if (condition2) {
    // block of code to be executed if the condition1 is false and condition2 is true
} else {
    // block of code to be executed if the condition1 is false and condition2 is false
}
```

#### Short Hand If...Else (advanced)

There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

``` java
variable = (condition) ? expressionTrue :  expressionFalse;
```

#### Java Switch Statements (advanced)

Use the switch statement to select one of many code blocks to be executed.

``` java
switch(expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default:
        // code block
}
```

### For Loops

#### For Loop

for (statement 1; statement 2; statement 3) {
// code block to be executed
}

Statement 1 is executed (one time) before the execution of the code block. (int i = 0) sets a variable before the loop starts.

Statement 2 defines the condition for executing the code block. (i < number) If the condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 is executed (every time) after the code block has been executed. (i++) increases a value each time the code block in the loop has been executed.

#### For-Each Loop

for (type variableName : arrayName) {
// code block to be executed
}

Instead of an arrayName you can also use any kind of collection.

### Operators

#### Arithmetic Operators

| Operator | Name           | Description                            | Example |
|----------|----------------|----------------------------------------|---------|
| +        | Addition       | Adds together two values               | x + y   |	
| -        | Subtraction    | Subtracts one value from another       | x - y   |	
| *        | Multiplication | Multiplies two values                  | x * y   |	
| /        | Division       | Divides one value by another           | x / y   |
| %        | Modulus        | Returns the division remainder         | x % y   |	
| ++       | Increment      | Increases the value of a variable by 1 | ++x     |	
| --       | Decrement      | Decreases the value of a variable by 1 | --x     |

#### Java Assignment Operators

| Operator | Example   | Same As    |
|----------|-----------|------------|
| =        | x = 5     | x = 5      |	
| +=       | x += 3    | x = x + 3  |	
| -=       | x -= 3    | x = x - 3  |	
| *=       | x *= 3    | x = x * 3  |	
| /=       | 	x /= 3   | 	x = x / 3 |	
| %=       | 	x %= 3   | 	x = x % 3 |

#### Java Comparison Operators

| Operator | Name         | Example |
|----------|--------------|---------|
| ==       | Equal to     | x == y  |	
| !=       | Not equal    | x != y  |	
| >        | Greater than | x > y   |

#### Java Logical Operators

| Operator    | Name        | Description                                             | Example                 |
|-------------|-------------|---------------------------------------------------------|-------------------------|
| &&          | Logical and | Returns true if both statements are true                | x < 5 &&  x < 10        |	
| double_pipe | Logical or	 | Returns true if one of the statements is true           | x < 5 double_pipe x < 4 |	
| !           | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10)      |

### Access Modifiers

| Class       | Package | Subclass | (same pkg) | Subclass (diff pkg) | World |
|-------------|---------|----------|------------|---------------------|-------|
| public      | +       | +        | +          | +                   | +     |
| protected   | +       | +        | +          | +                   |       |
| no modifier | +       | +        | +          |                     |       |		
| private     | +       |          |            |                     |       |

### Methods

``` java
accessModifier static returnType methodname(parameterList) {
    // code block to be executed
}
```

#### Method example

``` java
private static int absolute(int input) {
    int absoluteValue;
    if (int < 0) {
        absoluteValue = input;
    } else {
        absulteValue = input;
    }   
    return absoluteValue;
}
```

### Conventions

- class names begin with a capital letter and use CamelCase
- variables begin with small letter and use camelCase
- packagenames consist of small letters without separators like space or underscore
- CONSTANTS are written in capital letters with underscore to separate
- methods begin with small letter and use camelCase

### Classes and Objects

#### MyClass example

```java
public class MyClass {
    int myAttribute;
    
    // constructor
    public MyClass(int myAttribute) {
        // this allows access to class attributes
        this.myAttribute = myAttribute; 
    }
    
    public int myMethod(int myInputParameter) {
        int myLocalVariable = 0;
        // code block to be executed
        return myLocalVariable;
    }
}
```

#### Getter and Setter example

```java
public class MyClass {
    private int myPrivateVariable;
    
    // constructor
    public MyClass(int myPrivateAttribute) {
        // this allows access to class attributes
        this.myPrivateVariable = myPrivateVariable; 
    }
    
    // allows read access from outside the class
    public int getMyPrivateVariable() {
        return myPrivateAttribute;
    }
    
    // allows write access from outside the class
    public void setMyPrivateVariable(int myPrivateVariable) {
        this.myPrivateVariable = myPrivateVariable;
    }
    
    public int myMethod(int myInputParameter) {
        int myLocalVariable = 0;
        // code block to be executed
        return myLocalVariable;
    }
}
```

#### Create Object and call methods

```java
public class MyClass {
    int myAttribute;
    
    // constructor
    public MyClass(int myAttribute) {
        // this allows access to class attributes
        this.myAttribute = myAttribute; 
    }
    
    public int myMethod(int myInputParameter) {
        int myLocalVariable = 0;
        // code block to be executed
        return myLocalVariable;
    }
}

public class MyApplication {
    
    public static void main(String[] args) {
        // create new MyClass Object
        MyClass myClass = new MyClass(5);
        myClass.myMethod(7);
    }
}
```