# Java Interview Coding Questions

**Java Interview Coding Questions (DSA + Core Java Mix)**

This repository contains **frequently asked Java coding interview questions** with clean and optimized solutions.  
Each solution is written in **Java** and explained **line-by-line in Hinglish** for better understanding.

---

##  Topics Covered
-  Array & String Based
-  Number & Math Based
-  Stack, Queue, LinkedList
-  Sorting & Searching
-  OOP & Java Specific
-  Concurrency & Multithreading
-  System Design (OOP Based)
-  Advanced (for 2–5 YOE)

---

##  Question List

### Array & String Based
- Reverse a string without using built-in methods.
- Check if a string is palindrome.
- Find the first non-repeating character in a string.
- Count occurrences of each character in a string.
- Find missing number in an array of 1 to N.
- Find duplicate elements in an array.
- Rotate an array by K steps.
- Find maximum subarray sum (Kadane’s Algorithm).
- Merge two sorted arrays without using extra space.
- Find longest substring without repeating characters.

### Number & Math Based
- Check if a number is prime.
- Print Fibonacci series up to N.
- Find factorial using recursion and iteration.
- Check if a number is Armstrong number.
- Find GCD and LCM of two numbers.
- Swap two numbers without using third variable.
- Convert decimal to binary and vice-versa.
- Count number of set bits in an integer.
- Reverse digits of an integer.
- Check if a number is palindrome.

### Stack, Queue, LinkedList
- Implement stack using array and LinkedList.
- Implement queue using array and LinkedList.
- Reverse a linked list.
- Detect cycle in a linked list.
- Find middle element of linked list.
- Implement LRU Cache.
- Evaluate postfix expression.
- Next Greater Element problem.

### Sorting & Searching
- Implement Binary Search.
- Implement QuickSort / MergeSort.
- Find Kth largest element in array.
- Search in rotated sorted array.
- Find peak element in array.

### OOP & Java Specific
- Implement Singleton class.
- Implement custom Immutable class.
- Difference between == and equals(), implement equals() and hashCode().
- Implement Producer-Consumer problem using wait/notify.
- Implement Thread-safe Singleton (Double-checked locking).
- Write Java program for Deadlock example.
- Multi-threaded program to print odd and even numbers alternately.

### Advanced (for 2–5 YOE)
- Design a parking lot system (OOP Design).
- Implement a simple Cache with HashMap + Doubly LinkedList.
- Design tic-tac-toe game logic.
- Java Stream API question – filter, map, collect.
- Concurrency: Use ExecutorService to run multiple threads.

---

##  Project Structure
```
Java-Interview-Coding/
│── src/
│   ├── easy/
│   │   ├── ReverseString.java
│   │   ├── PalindromeCheck.java
│   │   ├── FirstNonRepeatingChar.java
│   │   └── MissingNumber.java
│   │
│   ├── medium/
│   │   ├── KadaneAlgorithm.java
│   │   ├── MergeSortedArrays.java
│   │   ├── KthLargestElement.java
│   │   └── BinarySearch.java
│   │
│   ├── hard/
│   │   ├── LRUCache.java
│   │   ├── ProducerConsumer.java
│   │   ├── DeadlockExample.java
│   │   └── ParkingLotSystem.java
│
│── README.md
```

---

##  Problem – Reverse a String

**Problem:** Reverse a string without using built-in `StringBuilder.reverse()`.

### Solution
```java
class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseString("Saurabh")); // hbaruaS
    }
}
```

### Explanation (Hinglish)
- String ko char array me convert kiya.
- Left aur Right pointers rakhe.
- Jab tak left < right hai → swap karte rahe.
- End me array ko wapas string me convert karke return kiya.

---

## ▶️ How to Run
1. Clone this repo:
   ```bash
   git clone https://github.com/Github-Saurabh0/Java-Interview-Coding-Questions-DSA-Core-Java-Mix-.git
   cd java-interview-coding
   ```
2. Compile a Java file:
   ```bash
   javac src/easy/ReverseString.java
   ```
3. Run the program:
   ```bash
   java src.easy.ReverseString
   ```

---

##  Contributing
Want to add new questions? Fork the repo, add your code, and create a PR!

---

##  Connect with Me
👤 [Saurabh Kushwaha](https://www.linkedin.com/in/saurabh884095/)  
📧 Saurabh@wearl.co.in
