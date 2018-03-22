package homework2;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List unique(List list) {
		if (list.size() == 1)
			return list;

		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;

	}

	/**
	 * Calculate fibonacci sequence
	 * 
	 * @param n
	 *            is fibonacci that we want to know
	 * @return result of fiboncci
	 */
	public static long sampleFibonacci(int n) {
		// the base case
		if (n < 2)
			return 1;
		// the recursive step
		return sampleFibonacci(n - 1) + sampleFibonacci(n - 2);
	}

	/**
	 * Calculate fibonacci sequence.
	 * 
	 * @param n
	 *            is sequence of fibonacci that we want to know
	 * @return result of fiboncci
	 */
	public static int fibonacci(int n) {
		return fibonacciHelper(0, 1, n);
	}

	/**
	 * Helper method for fibonacci
	 * @param a
	 * 			is the first sequence of fibonacci
	 * @param b
	 * 			is the second sequence of fibonacci
	 * @param n
	 * 			is the sequence of fibonacci  that we want to know
	 * @return	result of fibonacci
	 */
	public static int fibonacciHelper(int a, int b, int n) {
		if (n == 0)
			return a;
		else
			return fibonacciHelper(b, a + b, n - 1);
	}

	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		// list.add("a");
		// list.add("a");
		// list.add("b");
		// list.add("c");
		// list.add("a");
		// list.add("a");
		// unique(list);
		// for (String a : list) {
		// System.out.print(a);
		// }
		System.out.println(fibonacci(5));
	}
}
