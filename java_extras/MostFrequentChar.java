public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char maxChar = ' ';
        int maxCount = -1;
        for (char c : str.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }
        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}