public class studentgrade {
    public static void main(String[] args) {
        int marks = 20;
        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 30) {
            System.out.println("Grade C");
        } else if (marks < 30) {
            System.out.println("FAILED");
        } else
            System.out.println("Invalid marks");
    }
}
