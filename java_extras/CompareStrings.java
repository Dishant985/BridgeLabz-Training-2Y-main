public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";

        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        if (i == minLength) {
            if (s1.length() == s2.length()) {
                System.out.println("Both strings are equal");
            } else if (s1.length() < s2.length()) {
                System.out.println(s1 + " comes before " + s2);
            } else {
                System.out.println(s2 + " comes before " + s1);
            }
        } else if (s1.charAt(i) < s2.charAt(i)) {
            System.out.println(s1 + " comes before " + s2);
        } else {
            System.out.println(s2 + " comes before " + s1);
        }
    }
}