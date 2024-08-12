package org.example;

public class KthLargestTest {
    public static void main(String[] args) {
        int[] test = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, test);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
