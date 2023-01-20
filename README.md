# Object Lab 2

## Learning Goals

- Add private instance variables to a Java class
- Instantiate 2 class instances and assign values to the instance variables
- Print object state
- Create and use a constant variable

## Instructions

The starter project contains a class named `Employee` with an empty `main` method.


## Task #1 - Add private instance variables and create 2 `Employee` objects

1. Edit the `Employee` class to add 2 private instance variables named `name` and `hoursWorked`.
   The `name` is a string, while `hoursWorked` is an int.
   -Make sure you use the `private` accessor keyword for each instance variable.
2. Edit the `main()` method to create 2 instances of `Employee`.  Declare local variables named
   `employee1`  and `employee2` and assign the variables to reference the new `Employee` instances.
3. Add assignment statements to set the state of each object as shown below:

   ![lab2 object state](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/lab2_objectstate.png)

4. Add the following statements:

   ```java
   // Define format string and print employee information
   String format = "%s: hours worked = %d.%n";
   System.out.printf(format, employee1.name, employee1.hoursWorked);
   System.out.printf(format, employee2.name, employee2.hoursWorked);
   ```

5. Run the `main()` method and confirm the output:

   ```text
   Sasha: hours worked = 14.
   Tal: hours worked = 26.
   ```

## Task #2 - Add a constant for the hourly rate

1. Edit the `Employee` class to add another new field, a constant variable
   (i.e. final and static) named `HOURLY_RATE` assigned to the value 18.50.
2. Update the `format` string to include the weekly pay.  The format specifier  `%.2f` indicates a floating
   point number with 2 digits after the decimal point:

   ```java
   String format = "%s: hours worked =%d, weekly pay = $%.2f.%n";
   ```

3. Update the two print statements to provide an additional argument to print each employee's weekly pay
   (number of hours worked * hourly rate).  Run the `main()` method and confirm the output:

   ```text
   Sasha: hours worked =14, weekly pay = $259.00.
   Tal: hours worked =26, weekly pay = $481.00.
   ```


## Task #3 - Run Junit Tests

Within the `test` folder is a Junit test class named  `EmployeeTest`
that tests the output produced from executing the `main()` method
defined in the `Employee` class.

Run `EmployeeTest` and confirm the test passes.

![lab 2 junit test passes](https://curriculum-content.s3.amazonaws.com/6676/java-mod2-oop-fundamentals/object_lab2_junit.png)
