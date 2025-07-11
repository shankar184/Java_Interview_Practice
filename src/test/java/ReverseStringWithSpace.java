public class ReverseStringWithSpace {

          public static void main(String[] args) {

            String input = "I am a Software Tester";
            char[] chars = input.toCharArray();
            int left = 0, right = chars.length - 1;

            while (left < right) {
                // Skip spaces
                if (chars[left] == ' ') {
                    left++;
                } else if (chars[right] == ' ') {
                    right--;
                } else {
                    // Swap letters
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }

            System.out.println("Reversed: " + new String(chars));

          }
        }


