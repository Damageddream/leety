package org.example;

import java.util.HashSet;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test12 = {2, 4};
        int[] test2 = {1, 2, 3, 6};
        int[] test22 = {2, 3, 4, 5};
        System.out.println(getCommon(test1, test12) == 2);
        System.out.println(getCommon(test2, test22) == 2);

    }
    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> checkSet = new HashSet<>();
        for (int num : nums1) {
            checkSet.add(num);
        }
        for (int num : nums2) {
            if(checkSet.contains(num)){
                return num;
            }

        }
        return  -1;
    }

//    public static int getCommon(int[] nums1, int[] nums2) {
//        int start = 0;
//        if (nums1[start] == nums2[start]) {
//            return nums1[start];
//        }
//        int target = Math.max(nums1[start], nums2[start]);
//        int[] searchNums = nums1[start] == target ? nums2 : nums1;
//        while(start < Math.max(nums1.length, nums2.length)){
//            int left = 0;
//            int right = searchNums.length - 1;
//            while(left <= right){
//                int mid = (left + right) / 2;
//                int temp = searchNums[mid];
//                if(target == temp){
//                    return temp;
//                }
//                if(target < temp){
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//            }
//            start++;
//            if (nums1[start] == nums2[start]) {
//                return nums1[start];
//            }
//            target = Math.max(nums1[start], nums2[start]);
//            searchNums = nums1[start] == target ? nums2 : nums1;
//        }
//
//        return -1;
//    }
}
