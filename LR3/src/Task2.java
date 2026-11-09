public class Task2 {

        public static void main(String[] args) {
            checkPalindrome("А роза упала на лапу Азора");
            checkPalindrome("Привет, мир!");
        }
        private static void checkPalindrome(String str) {
            String cleaned = str.replaceAll("\\s+", "").toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();
            boolean isPalindrome = cleaned.equals(reversed);
            System.out.println("Исходная строка: \"" + str + "\"");
            System.out.println("Перевёрнутая:     \"" + reversed + "\"");
            System.out.println("Является палиндромом: " + isPalindrome);
            System.out.println();
        }
    }

