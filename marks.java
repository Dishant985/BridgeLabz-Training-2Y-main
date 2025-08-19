public class marks {
    public static void main(String[] args) {
        int marks1 = 94;
        int marks2 = 95;
        int marks3 = 96;
        
        double average = (marks1 + marks2 + marks3) / 3.0;
        double percentage = (average / 100) * 100;
        
        System.out.println("Percentage: " + percentage + "%");
    }
}
