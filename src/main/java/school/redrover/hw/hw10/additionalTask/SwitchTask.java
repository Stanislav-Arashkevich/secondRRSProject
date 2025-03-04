package school.redrover.hw.hw10.additionalTask;

public class SwitchTask {

    public String digitToText(int grade) {

        switch (grade) {
            case 5: return "отлично";
            case 4: return "хорошо";
            case 3: return "удовлетворительно";
            case 2: return "неудовлетворительно";
            case 1: return "плохо";
            default: throw new IllegalArgumentException("This digit doesn't convert to text" + grade);
        }
    }

    public String litterToText(char grade) {

        return switch (grade) {
            case 'A' -> "отлично";
            case 'B' -> "хорошо";
            case 'C' -> "удовлетворительно";
            case 'F' -> "неудовлетворительно";
            default -> throw new IllegalArgumentException("This char doesn't convert to text" + grade);
        };
    }

    public static void main(String[] args) {

        SwitchTask converter = new SwitchTask();

        System.out.println(converter.digitToText(5)); // отлично
        System.out.println(converter.litterToText('B')); // хорошо

        try {
            System.out.println(converter.digitToText(6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Некорректная цифровая оценка: 6
        }

        try {
            System.out.println(converter.litterToText('X'));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Некорректная символьная оценка: X
        }
    }
}