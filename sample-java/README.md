# initial-project
Template java project to resolve some exercises.

## Flow to implement
For each exercise, there should be a class in the main package to perform the proposed exercise. <br>
The main class, it will only have the responsibility to call the method responsible for the rule. <br>
The classes responsible for the rules should be created in the business package. <br>
And if it is necessary to create some POJO, it should be created in the package model. <br>

## Exercises

**Before any exercise, a dependency on log4 must be added to print the results of some exercises. Sysout will not be used.**<br>

</br>

**1** - Write a Java program to print the result of the following operations. <br>
Test Data: <br>
a. -5 + 8 * 6 <br>
b. (55+9) % 9 <br>
c. 20 + -3*5 / 8 <br> 
d. 5 + 15 / 3 * 2 - 8 % 3 <br> 
Expected Output : <br>
43 <br>
1 <br>
19 <br>
13 <br>

**2**. Write a Java program to compare two numbers. <br>
Input Data: <br>
Input first integer: 25 <br>
Input second integer: 39 <br>
Expected Output <br>
<br>
25 != 39 <br>                                                                          
25 < 39 <br>                                                                     
25 <= 39 <br>

**3**. Write a Java program to compare two numbers. Same like the **2**, but now will receive an float number. Use BigDecimal comparation. <br>
Input Data: <br>
Input first integer: 25.32 <br>
Input second integer: 39.40 <br>
Expected Output <br>
<br>
25 != 39 <br>                                                                          
25 < 39 <br>                                                                     
25 <= 39 <br>

**4**. Write a Java program to reverse a word. <br>
Sample Output: <br>
<br>
Input a word: dsaf <br>
Reverse word: fasd <br>

**5**. Write a program in Java to input 5 numbers from keyboard and find their sum and average. <br>
<br>
Test Data <br>
Input the 5 numbers : 1 2 3 4 5 <br> 
Expected Output : <br>
<br>
Input the 5 numbers : <br>                                                            
1 <br>                                                       
2 <br>                                                                           
3 <br>                                                                           
4 <br>                                                                           
5 <br>                                                                           
The sum of 5 no is : 15 <br>                                                          
The Average is : 3.0  <br>

**6**. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.<br>
Sample Output:<br>
<br>
Original Array: [20, 30, 40] <br>                                           
New array after swaping the first and last elements: [40, 30, 20] <br>

**7**. Write a Java program to merge two given sorted array of integers and create a new sorted array. <br>
array1 = [1,2,3,4] <br>
array2 = [2,5,7, 8] <br>
result = [1,2,2,3,4,5,7,8] <br>

**8**. Write a Java program to break an integer into a sequence of individual digits. <br>
<br>
Test Data <br>
Input six non-negative digits: 123456 <br>
Expected Output : <br>
1 2 3 4 5 6 <br>

**9**. Write a Java program that prints the current datetime. Use LocalDate/LocalDateTime from Java 8. <br>

**10**. Write a Java program to get a number from the user and print whether it is positive or negative. <br>
<br>
Test Data <br>
Input number: 35 <br>
Expected Output : <br>
Number is positive <br>

**11**. Write a Java program to find the number of days in a month. Use LocalDate/LocalDateTime from Java 8. <br>
<br>
Test Data <br>
Input a month number: 2 <br>
Input a year: 2016 <br>
Expected Output : <br>
February 2016 has 29 days <br>

**12**. Write a Java program to test if an array contains a specific value. <br>
<br>
For example, the array [10,20,30,40] <br>
Input: 32 <br>
Print some error or if has the number, print some success. <br>

**13**. Write a Java program to remove a specific element from an array. <br>

**14**. Write a Java program to insert an element (specific position) into an array. <br>

**15**. Write a Java program to find the maximum and minimum value of an array. <br>

**16**. Write a Java program to reverse an array of integer values. <br>

**17**. Write a Java program to convert a POJO object to a json. Use GSON API. <br>
<br>
For example, object account, with the attributes name (with value conta1) and id(with value 2) <br>
The output will be <br>
```
{
	"id": 2,
	"name": "conta1"
}
```
<br>

**18**. Write a Java program to convert a string date to a LocaDate. Use LocalDate from java 8. <br>
<br>
For example, the string **20/10/2010** will converted to a LocalDate object. <br>




