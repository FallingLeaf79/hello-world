/* I attempted to take on a well-known game of FizzBuzz by making a program that
 * has a high level of modularity (you can easily add or change words the
 * program will print and at what multiples should that happen).
 * Try it out for yourself; add some extra words and divisors on lines 10 and 11
 * respectively and see what happens!
 */

public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        String[] words = {"Fizz", "Buzz"};
        int[] multiples = {3, 5};
        int limit = 100; //The program will print up to this number (inclusive).

        if (words.length != multiples.length) {
            throw new Exception("Something went wrong there, pardner.");
        }

        for (int i = 1; i <= limit; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < multiples.length; j++) {
                if (i % multiples[j] == 0) {
                    stringBuilder.append(words[j]);
                }
            }
            if (stringBuilder.length() == 0) {
                stringBuilder.append(i);
            }
            System.out.println(stringBuilder);
            }
        }
    }
}
