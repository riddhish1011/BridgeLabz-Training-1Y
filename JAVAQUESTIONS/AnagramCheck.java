package JAVAQUESTIONS;

    import java.util.Arrays;

    public class AnagramCheck {
        public static void main(String[] args) {
            String str1 = "elbow";
            String str2 = "below";

            if (areAnagrams(str1, str2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }

        public static boolean areAnagrams(String str1, String str2) {
            // If lengths differ → not anagram
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }
    }

