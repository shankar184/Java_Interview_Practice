import java.util.Scanner;

public class LongestCommonSubString {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input strings

            String str1 = "testing";
            String str2 = "software";

            String longest = "";  // To store the longest common substring

            // Loop through all substrings of str1
            for (int i = 0; i < str1.length(); i++) {
                for (int j = i + 1; j <= str1.length(); j++) {

                    // Take substring of str1 from index i to j
                    String sub = str1.substring(i, j);

                    // If this substring is also in str2 and longer than previous
                    if (str2.contains(sub) && sub.length() > longest.length()) {
                        longest = sub;  // Update longest substring
                    }
                }
            }

            // Print result
            System.out.println("Longest Common Substring is: " + longest);

            sc.close();
        }
    }


