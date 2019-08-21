public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        String[] words = {"Fizz", "Buzz"};
        int[] multiples = {3, 5};

        if (words.length == multiples.length) {
            for (int i = 1; i <= 1000; i++) {
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
        } else {
            throw new Exception("Something went wrong there, pardner.");
        }
    }
}
