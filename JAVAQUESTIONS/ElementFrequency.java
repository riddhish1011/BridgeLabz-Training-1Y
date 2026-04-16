package JAVAQUESTIONS;

    import java.util.*;
    public class ElementFrequency {
        public static void main(String[] args) {

            int[] arr = {1, 2, 2, 3, 1, 4, 2};

            HashMap<Integer, Integer> freqMap = new HashMap<>();

            for (int num : arr) {
                if (freqMap.containsKey(num)) {
                    freqMap.put(num, freqMap.get(num) + 1);
                } else {
                    freqMap.put(num, 1);
                }
            }

            System.out.println("Element Frequencies:");
            for (int key : freqMap.keySet()) {
                System.out.println(key + " -> " + freqMap.get(key));
            }
        }
    }


