public class hello2 {

    public static void main(String[] args) {

        String studentName = "John Doe";
        int javaMarks = 85;
        int dbmsMarks = 90;
        int aiMarks = 88;
        int mathsMarks = 92;
        int englishMarks = 87;

        hello2 obj = new hello2();
        int totalMarks = obj.calculateTotal(javaMarks, dbmsMarks, aiMarks, mathsMarks, englishMarks);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);

        double percentage = obj.calculatePercentage(totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        String grade = obj.calculateGrade(percentage);
        System.out.println("Grade: " + grade);

        obj.checkResult(studentName, percentage);

        // String result = obj.checkResult(studentName, percentage);
        // System.out.println(result);
    }

    public int calculateTotal(int javaMarks, int dbmsMarks, int aiMarks, int mathsMarks, int englishMarks)

    {

     int  result =  javaMarks + dbmsMarks + aiMarks + mathsMarks + englishMarks;
     return result;

    }
public double calculatePercentage(int totalMarks){

    int maxMarks = 500; // Assuming each subject is out of 100
    double percentage = (totalMarks / (double) maxMarks) * 100;
return percentage;
    








}
public String calculateGrade(double percentage) {

    if (percentage >= 90) {
        return "A";
    } else if (percentage >= 80) {
        return "B";
    } else if (percentage >= 70) {
        return "C";
    } else if (percentage >= 60) {
        return "D";
    } else {
        return "F";
    }

    
}
public void  checkResult(String studentName, double percentage) {
    if (percentage >= 40) {
        System.out.println(studentName + " has passed the exam.");
    } else {
        System.out.println(studentName + " has failed the exam.");
    }

    
}

}







    

