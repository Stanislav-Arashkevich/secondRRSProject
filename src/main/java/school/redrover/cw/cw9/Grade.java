package school.redrover.cw.cw9;

public class Grade {

    private final int numGrade;

    public Grade(int numGrade) {

        if (numGrade < 1 || numGrade > 5) {
            throw new IllegalArgumentException("Grade must be form 1 to 5");
        }

        this.numGrade = numGrade;
    }

    public int getNumGrade() {
        return numGrade;
    }

    public static void main(String[] args) {
        Grade five = new Grade(5);
        System.out.println(five.getNumGrade());
    }
} 