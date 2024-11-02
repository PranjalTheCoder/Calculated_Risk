# Calculated Risk

## Overview
Calculated Risk is a simple calculator application built in Java that supports basic arithmetic operations as well as scientific calculations. The application also features a history manager to keep track of past calculations.

## Features
- Basic arithmetic operations: addition, subtraction, multiplication, and division.
- Scientific calculations (to be implemented).
- History management to store and display past calculations.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/CalculatedRisk.git
   cd CalculatedRisk
   ```
2. **Compile the Project Navigate to the src directory and compile the Java files:**
   ```bash
   cd src
   javac *.java
   ```
3. **Run the Application Execute the main class:**
   ```bash
   java Main
   ```
## Usage
1. After running the application, you can perform calculations by calling the methods from the Calculator or ScientificCalculator classes.
2. To view the calculation history, use the displayHistory() method from the Calculator class.

## Example
```java
Calculator calculator = new Calculator();
double result = calculator.add(5, 3);
System.out.println("Result: " + result);
calculator.displayHistory();
```
## Creator
This project was created by [Pranjal Tamrakar](https://github.com/PranjalTheCoder).
