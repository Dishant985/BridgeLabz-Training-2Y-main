public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is powerful";
        String wordToReplace = "Java";
        String newWord = "Python";

        String result = sentence.replace(wordToReplace, newWord);
        System.out.println("Modified Sentence: " + result);
    }
}