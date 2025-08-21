public class pendistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;   // division operator
        int remainingPens = pens % students;    // modulus operator

        System.out.println(
            "The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens
        );
    }
}
