# Task Sheet

Within this course we will work on different practice tasks.
If you have trouble with any of the tasks you can always take a look at the cheat sheet or ask one of the trainers.

You should always be able to solve the normal tasks before we continue with the next one because some tasks build up on each other.
Please let us know if we go on too fast. 

Tasks with the advanced tag are not mandatory for the understanding and are only there to provide a challenge to those who finish the normal tasks early.
So don't worry if you have not finished the advanced stories in time. 

We will provide one possible solution for all tasks at the end of each day.

## 0 Git

Create a GitHub account

## 1 Basics

### 1.0 Hello World

Write your first program.

- Create a java class with the name "Hello World" in the module basics.
- Add a main method to this class.
- Use the println() method to write the words "Hello World!" to the console.

### 1.1 User Input

- Create a java class with the name "UserInput" in the module basics.
- Add a main method to this class.
- Use the Scanner class to get the name of the user.
- Display the name of the user.

### 1.2 Write your own story (advanced)

- Create a java class with the name "MyOwnStory" in the module basics.
- Create an executable program that asks the user for two names.
- Print out a story that contains each of the names multiple times.

## 2 Conditions

### 2.0 Personal Greeting

Hint: use if ... else

- Create a java class with the name "PersonalGreeting" in the module conditions.
- Create an executable program that takes the username as an input and displays a greeting message containing the username.
- If the username is your own name display a special message.

### 2.1 Password Checker

Hint: use if ... else if ... else

- Create a java class with the name "PasswordChecker" in the module conditions.
- Create an executable program that takes the username as an input and asks afterwords for a password.
- The program checks the password for at least two users and displays a message if the password is correct or not.
- If the user is not known display "The user is unknown."

### 2.2 Advanced Password Checker

Hint: use switch ... case

- Create a java class with the name "AdvancedPasswordChecker" in the module conditions.
- Create an executable program that takes the username as an input and asks afterwords for a password.
- The program checks the password for multiple users and displays a message if the password is correct or not.
- If the user is not known display "The user is unknown."

### 2.3 Recursive Fibonacci (advanced)

Hint: Recursive methods call them self. It is always important to have an interrupt condition using recursive calls.

- The Fibonacci series is a series in which each number is the sum of the previous two numbers. Example: 1, 1, 2, 3, 5, 8, 13, 21, ...
- Create an executable program that takes a number and returns the Fibonacci number at this position using a recursive method.
- Think about why this recursive call can be problematic.

## 3 Loops

### 3.1 Article List

### 3.2 User selection

## 4 Repetition day one

### 4.1 Calculator

- Create a calculator application that allows the user to put in two numbers and either a + or - operation.
- (advanced) Also implement the * and / operators.

### 4.2 Todo list

- Create a todo list app.
- The User is able to add points to the list, remove points from the list or show the list.

### 4.3 Number search

- Create an Arraylist containing 5 different Integer values.
- Ask the user for a number x.
- Find the x highest number in the ArrayList.

### 4.4 shopping list (advanced)

Hint: Use a Hashmap<String, Integer>

- Create a shopping list app.
- The user can add items to the list
- The user can delete items from the list
- The user can show the items on the list with the amount for each item
- The shopping list also contains the amount for each item

## 5 Methods

### 5.0 Supermarket

- Create a java class with the name "Supermarket" in the module supermarket.
- Create a public static method called "calculateGrossPrice" that takes the net price and the tax rate and returns the gross price.
- Use this method to calculate the price of an apple and the price of a bottle of vine.
- Use constants to save the different tax values.

### 5.1 Prime checker
- Create a method "isPrime" that takes an integer as input.
- Check if the number is a prime number and return true or false.
- Ask the user for input and call the method

### 5.2 Greatest common divisor (advanced)
- https://en.wikipedia.org/wiki/Greatest_common_divisor
- Calculate the greatest common divisor using prime factorisation
- Do the same using Euclid's algorithm

### 5.3 Oktoberfest
- Create a java class with name "Tent" in module party. The tent should contain information about tables, people in the tent, drinks menu, food menu. 
For each Tent you should calculate how many people are in the tent, and don't allow more people than maximum capacity, how much drinks they drink in one day in total, what is the profit of the tent in one day.
- Create a java class with name "Oktoberfest" in the module party. In this class you should create some instances of Tent objects.
Print information about the tents(Ex: total sum of people in all instantiated tents in one day).

## 6 Inheritance

### 6.1 Shapes
- Create the classes "Shape", "Rectangle", "Triangle", "Circle" and "Square".
- Shape should be abstract and contain the abstract method calculateSurface()

## 7 Teamwork

You will now work in teams of two. The main goal is that the whole team always has the same understanding of what you are doing and why.
The second goal is to finish your task.
For all projects do the following steps:
- Think about how you can display the game board on the command
- Think about how the user input should work

### 7.1 2048
- Code the game 2048 on the commandline https://en.wikipedia.org/wiki/2048_(video_game)

### 7.2 Connect Four
- Code the game connect four https://en.wikipedia.org/wiki/Connect_Four

### 7.3 Tic Tac Toe
- Code the game Tic Tac Toe https://en.wikipedia.org/wiki/Tic-tac-toe

### 7.4 Code Minesweeper (advanced)
- Code the game minesweeper https://en.wikipedia.org/wiki/Minesweeper_(video_game)

### 7.5 Code Blackjack (advanced)
- Code the game blackjack https://en.wikipedia.org/wiki/Blackjack