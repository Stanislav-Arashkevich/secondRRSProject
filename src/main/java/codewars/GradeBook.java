package codewars;

public class GradeBook {

    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;

        if (average >= 90){
            return 'A';
        } else if (80 <= average) {
            return 'B';
        } else if (70 <= average) {
            return 'C';
        } else if (60 <= average) {
            return 'D';
        }

        return 'F';
    }
}
