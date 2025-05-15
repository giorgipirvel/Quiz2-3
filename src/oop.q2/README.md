List Processing Application - Quiz #2

Overview

This project implements a list processing application based on the animation shown at max.ge/oop_q23/t1/t1_giorgi_pirveli_2_49679162.html. The application processes two lists: a list of integers and a list of strings, creating a third list by using the integers as indices to select elements from the string list.

Implementation Details
ListProcessor Class
The main class containing the list processing logic and a nested Task1 class that performs the actual operations.
Task1 Inner Class
This class handles:

Storing and managing two input lists: list1 (integers) and list2 (strings)
Processing these lists to produce a result list (list3)
Displaying the processing results

Algorithm
The algorithm works as follows:

Initialize list1 with predefined integer values
Initialize list2 with predefined string values
Process the lists:

For each integer value in list1, use it as an index to access an element in list2
Add the selected element to list3


Display the results and verify against the expected outcome

Visual Representation
list1 (Integers):
[7, 5, 8, 7, 4, 9, 2, 2, 3, 8, 3, 5, 3]
list2 (Strings):
["v2rg", "tH0", "sTYZd", "8us", "s2F", "SkGH", "UGR", "W9K7", "Zk9mF", "rLohz", "obi", "8DN", "Kiwv", "N19fG", "1jg3", "6xE", "ATeS", "Q7pcv"]
Processing:

list1[0] = 7 → list2[7] = "W9K7"
list1[1] = 5 → list2[5] = "SkGH"
list1[2] = 8 → list2[8] = "Zk9mF"
...and so on for all elements in list1

list3 (Result):
["W9K7", "SkGH", "Zk9mF", "W9K7", "s2F", "rLohz", "sTYZd", "sTYZd", "8us", "Zk9mF", "8us", "SkGH", "8us"]
Running the Application
To run the application:

Ensure you have Java Development Kit (JDK) installed
Compile the source code:
javac oop/q2/ListProcessor.java

Run the compiled program:
java oop.q2.ListProcessor


Features

Default processing: Uses predefined values for list1 and list2
Custom processing: Allows providing custom lists for testing
Error handling: Handles invalid indices gracefully
Verification: Compares results with expected outcomes

Output Example
=== Task 1: List Processing ===

Initial Lists:
List 1 (Indices): [7, 5, 8, 7, 4, 9, 2, 2, 3, 8, 3, 5, 3]
List 2 (Elements): [v2rg, tH0, sTYZd, 8us, s2F, SkGH, UGR, W9K7, Zk9mF, rLohz, obi, 8DN, Kiwv, N19fG, 1jg3, 6xE, ATeS, Q7pcv]

Processing Steps:
list1[0] = 7 -> list2[7] = "W9K7"
list1[1] = 5 -> list2[5] = "SkGH"
list1[2] = 8 -> list2[8] = "Zk9mF"
list1[3] = 7 -> list2[7] = "W9K7"
list1[4] = 4 -> list2[4] = "s2F"
list1[5] = 9 -> list2[9] = "rLohz"
list1[6] = 2 -> list2[2] = "sTYZd"
list1[7] = 2 -> list2[2] = "sTYZd"
list1[8] = 3 -> list2[3] = "8us"
list1[9] = 8 -> list2[8] = "Zk9mF"
list1[10] = 3 -> list2[3] = "8us"
list1[11] = 5 -> list2[5] = "SkGH"
list1[12] = 3 -> list2[3] = "8us"

Result:
List 3 (Result): [W9K7, SkGH, Zk9mF, W9K7, s2F, rLohz, sTYZd, sTYZd, 8us, Zk9mF, 8us, SkGH, 8us]

Expected Result: [W9K7, SkGH, Zk9mF, W9K7, s2F, rLohz, sTYZd, sTYZd, 8us, Zk9mF, 8us, SkGH, 8us]
Results Match: true
Author
Giorgi Pirveli