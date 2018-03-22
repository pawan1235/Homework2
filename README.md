# Homework2

4.1

Because in a simple fibonacci recursion the Big O notation of the code is 2^n because in the code there are calling 2 recursion and each of recursion will call another 2 recursion and so on.

```java
return sampleFibonacci(n - 1) + sampleFibonacci(n - 2);
```

But with the helper method The big O notation will decrease to just N because there is only calling 1 recursion. So the running time will be very fast with the helper method

```java
return fibonacciHelper(b, a + b, n - 1);
```
Example of Running time where n is n sequence of fibonacci

| n        | O(2^N)           | O(N)  |
| ------------- |:-------------:| -----:|
| 1     | 2 | 1 |
| 2     | 4      |   2 |
| 4 | 16     |    4 |
| 10 | 1024    |    10 |
| 50 | 1.126e+15     |    50 |

You can see O(n) is very fast compare to O(2^n)
