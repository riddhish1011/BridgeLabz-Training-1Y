package JAVAQUESTIONS;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5};
        int[] arr4 = {1, 2, 9};

        System.out.println(isSubset(arr1, arr2));
        System.out.println(isSubset(arr1, arr4));
    }

    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }
}
