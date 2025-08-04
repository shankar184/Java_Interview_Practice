package SeleniumPOMFramework;

public class ImportantJavaMethods {

    String methods::

            | Method                                  | Use                                     |
            | --------------------------------------- | --------------------------------------- |
            | `str.length()`                          | Returns string length                   |
            | `str.charAt(i)`                         | Gets character at index `i`             |
            | `str.substring(start, end)`             | Extracts substring                      |
            | `str.indexOf(ch)`                       | Returns first occurrence of a character |
            | `str.lastIndexOf(ch)`                   | Returns last occurrence of a character  |
            | `str.equals(s2)`                        | Checks if two strings are equal         |
            | `str.equalsIgnoreCase(s2)`              | Compares strings ignoring case          |
            | `str.contains("abc")`                   | Checks if substring exists              |
            | `str.toLowerCase()` / `toUpperCase()`   | Converts case                           |
            | `str.trim()`                            | Removes leading and trailing spaces     |
            | `str.replace(a, b)`                     | Replaces characters                     |
            | `str.split(" ")`                        | Splits string into array                |
            | `str.startsWith("a")` / `endsWith("z")` | Checks start or end of string           |
            | `new StringBuilder(str).reverse()`      | Reverses a string                       |


    Array Utility Methods::

            | Method                                         | Use                             |
            | ---------------------------------------------- | ------------------------------- |
            | `Arrays.sort(arr)`                             | Sorts array in ascending order  |
            | `Arrays.sort(arr, Collections.reverseOrder())` | Sorts in descending order       |
            | `Arrays.toString(arr)`                         | Converts array to string        |
            | `Arrays.binarySearch(arr, key)`                | Searches element (sorted array) |
            | `Arrays.equals(arr1, arr2)`                    | Compares two arrays             |
            | `Arrays.fill(arr, value)`                      | Fills array with given value    |


    Collection Utility Methods::

            | Method                                         | Use                             |
            | ---------------------------------------------- | ------------------------------- |
            | `Collections.sort(list)`                       | Sorts list in ascending order   |
            | `Collections.sort(list, Collections.reverseOrder())` | Sorts in descending order       |
            | `Collections.reverse(list)`                    | Reverses the list               |
            | `Collections.shuffle(list)`                    | Randomly shuffles the list      |
            | `Collections.max(list)`                        | Finds maximum element           |
            | `Collections.min(list)`                        | Finds minimum element           |
            | `Collections.frequency(list, element)`         | Counts occurrences of an element|

    Wrapper class Methods::

            | Method                                         | Use                             |
            | ---------------------------------------------- | ------------------------------- |
            | `Integer.parseInt(str)`                        | Converts string to int          |
            | `Double.parseDouble(str)`                      | Converts string to double       |
            | `Boolean.parseBoolean(str)`                    | Converts string to boolean      |
            | `String.valueOf(int)`                          | Converts int to string          |
            | `String.valueOf(double)`                       | Converts double to string       |
            | `String.valueOf(boolean)`                      | Converts boolean to string      |

    Character class Methods::

            | Method                                         | Use                             |
            | ---------------------------------------------- | ------------------------------- |
            | `Character.isDigit(ch)`                        | Checks if character is digit    |
            | `Character.isLetter(ch)`                       | Checks if character is letter   |
            | `Character.isWhitespace(ch)`                   | Checks if character is whitespace|
            | `Character.toUpperCase(ch)`                    | Converts to uppercase            |
            | `Character.toLowerCase(ch)`                    | Converts to lowercase            |
            | `Character.isAlphabetic(ch)`                   | Checks if character is alphabetic|

    Data Structure Methods::

            | Method                                         | Use                             |
            | ---------------------------------------------- | ------------------------------- |
            | `List.add(element)`                            | Adds element to list            |
            | `List.remove(index)`                           | Removes element at index        |
            | `List.get(index)`                              | Gets element at index           |
            | `Set.add(element)`                             | Adds element to set             |
            | `Set.contains(element)`                        | Checks if set contains element  |
            | `Map.put(key, value)`                          | Adds key-value pair to map      |
            | `Map.get(key)`                                 | Gets value by key               |


    Math class methods::

            | Method                                         | Use                             |
            | ---------------------------------------------- | ------------------------------- |
            | `Math.abs(x)`                                  | Returns absolute value          |
            | `Math.max(a, b)`                               | Returns maximum of two values   |
            | `Math.min(a, b)`                               | Returns minimum of two values   |
            | `Math.sqrt(x)`                                 | Returns square root             |
            | `Math.pow(base, exponent)`                     | Returns power                   |
            | `Math.random()`                                | Generates random number         |
            | `Math.round(x)`                                | Rounds to nearest integer       |
}
