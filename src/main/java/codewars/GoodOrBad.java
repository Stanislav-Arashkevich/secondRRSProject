package codewars;

/*
    В этой задаче вам нужно проверить предоставленный массив (String[] x) на наличие хороших идей «good»
    и плохих идей «bad». Если есть одна или две хорошие идеи, верните «Publish!»,
    если их больше двух, верните «I smell a series!». Если хороших идей нет, как это часто бывает, верните «Fail!».
 */

public class GoodOrBad {

    public static String well(String[] x) {

        int countGood = 0;

        for (String s : x) {

            if (s.equals("good")){
                countGood++;
            }
        }

        if (countGood == 0){
            return "Fail!";
        } else if (countGood > 0 && countGood < 3){
            return "Publish!";
        } else {
            return  "I smell a series!";
        }
    }
}