package school.redrover.cw.cw6;

public class CW6 {

    public static void main(String[] args) {

//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = arr1.clone();
//
//        arr1[0] = -1;
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));


//        String str = "Hello, world!";
//        System.out.println(str.substring(6));
//        System.out.println(str.substring(0, 4));
//        System.out.println(str.substring(str.length() - 3));
//        System.out.println(str.charAt(5));
//
//        System.out.println(str.equals("HellO, wOrld!"));
//        System.out.println(str.equalsIgnoreCase("Hello, world!"));
//
//        System.out.println(str.compareTo("aaaa")); // Сравниватель. Если строка, в которой ищем, отличается (в эквиваленте
//        System.out.println(str.compareTo("AAAA")); // ASCII (но по числовому значению)), то будут выданы значения
//        System.out.println(str.compareTo("Hello, world!")); // меньше, больше либо равное 0. Своего рода флаг.
//
//        System.out.println(str.compareToIgnoreCase("Aaaa"));
//
//        System.out.println(str.contains("ll")); // Проверяет, содержит ли строка подстроку
//
//        System.out.println(str.startsWith("H"));  // Проверяет, начинается ли строка с подстроки
//        System.out.println(str.endsWith("!"));
//
//        System.out.println(str.indexOf('w'));
//        System.out.println(str.substring(str.indexOf('w')));
//
//        int indexOfW = str.indexOf('o');
//        System.out.println(str.indexOf("o"));
//        System.out.println(str.indexOf("o", 6));
//
//        if (indexOfW < 0) {
//            System.out.println("No such letter");
//        } else {
//            System.out.println(str.substring(indexOfW));
//        }
//
//        int indexOfo = str.lastIndexOf('o');
//        System.out.println(str.lastIndexOf("o"));
//        System.out.println(str.lastIndexOf("o", 6));
//
//        String str2 = "В лесу родилась елочка";
//        String[] words = str2.split(" ");
//        System.out.println(Arrays.toString(words));
//        System.out.println(words.length);
//
//        String[] words2 = str2.split("у р");
//        System.out.println(Arrays.toString(words2));
//        System.out.println(words2.length);

//        String[] months = {"январь", "февраль", "март",
//                "апрель", "май", "июнь", "июль", "август",
//                "сентябрь", "октябрь", "ноябрь", "декабрь"
//        };

//        String[] result = new String[months.length];
//        for (int i = 0; i < months.length; i++) {
//            result[months.length - i - 1] = months[i].toUpperCase();
//        }
//        System.out.println(Arrays.toString(result));
//
//        int[] result1 = new int[months.length];
//        for (int i = 0; i < months.length; i++) {
//            result1[i] = months[i].length();
//        }
//        System.out.println(Arrays.toString(result1));

//        for (String month : months) {
//            if (month.endsWith("ь")) {
//                System.out.println(month);
//            }
//            if (month.length() < 5) {
//                System.out.println(month);
//            }
//        }

//        int[][] daysInMonth = {
//                {31, 31, 28},   //winter
//                {31, 30, 31},   //spring
//                {30, 31, 31},   //summer
//                {30, 31, 30}    //fall
//        };
//
//        int sum = 0;
//        for (int[] days : daysInMonth) {
//            for (int day : days) {
//                sum += day;
//            }
//        }
//        System.out.println(sum);
//
//        int min = Integer.MAX_VALUE;
//        for (int[] days : daysInMonth) {
//            for (int day : days) {
//                int d = day;
//                if (d < min) {
//                    min = d;
//                }
//            }
//        }
//        System.out.println(min);

        int[][] dailyCalories = {
                {539, 700, 429, 430},
                {219, 454, 672, 770},
                {627, 702, 745},
                {858, 784, 230, 685},
                {460, 620, 350, 500},
                {490, 670, 495, 410, 890},
                {350, 820, 600, 300},
                {},
                {640, 750, 710, 600},
                {390, 430, 680, 310},
                {512, 540, 670, 455},
                {480, 580, 720, 350},
                {600, 750, 430, 530},
                {550, 490, 610, 700},
                {600, 650, 300, 400},
                {450, 560, 590, 630},
                {470, 710, 480, 520},
                {540, 440, 670, 540},
                {350, 800, 620, 490},
                {490, 560, 495, 475},
                {430, 350, 600, 410},
                {620, 550, 730, 490},
                {750, 640, 555, 680},
                {450, 480, 700, 590},
                {390, 520, 680, 430},
                {600, 720, 610, 530},
                {480, 650, 540, 410},
                {400, 500, 580, 610},
                {590, 740, 680, 700},
                {765, 800, 650, 699},
                {450, 500, 670, 550},
                {580, 620, 715, 590}
        };

//        int[] numbers = {1, 2, 3};
//        int one = numbers[1];
//
//        int[] wednesday = dailyCalories[2];
//        int breakfast = wednesday[0];
//        int breakfast2 = dailyCalories[2][0];
//        System.out.println(breakfast);
//        System.out.println(breakfast2);

//        for (int i = 0; i < dailyCalories.length; i++) {
//
//            int daySummary = 0;
//
//            for (int j = 0; j < dailyCalories[i].length; j++) {
//                daySummary += dailyCalories[i][j];
//            }
//
//            System.out.printf("On the %d day = %d calories%n", i, daySummary);
//        }

        int maxCalories = 0;
        int day = 0;
        for (int i = 0; i < dailyCalories.length; i++) {
            for (int j = 0; j < dailyCalories[i].length; j++) {
                if (dailyCalories[i][j] > maxCalories) {
                    maxCalories = dailyCalories[i][j];
                    day = i;
                }
            }
        }

        System.out.printf("The maximum number of calories %d was eaten in the %d day%n", maxCalories, day + 1);
        //String.format("The maximum number of calories %d was eaten in the %d day%n", maxCalories, day + 1);
    }
}