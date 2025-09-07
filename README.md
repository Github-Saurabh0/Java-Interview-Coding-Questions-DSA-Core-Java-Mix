# Java Interview Coding Questions

This repository contains **frequently asked Java coding interview questions** with clean and optimized solutions.  
Each solution is written in **Java** and explained **line-by-line in Hinglish** for better understanding.  

---

##  Topics Covered
-  String & Array Problems  
-  Number & Math Problems  
-  LinkedList, Stack & Queue  
-  Sorting & Searching  
-  OOP & Java Specific  
-  Concurrency & Multithreading  
-  System Design (OOP Based)  

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

##  Sample Problem – Reverse a String

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
