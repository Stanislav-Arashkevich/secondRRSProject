package codewars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReplaceFromList {

    public static List<String> number(List<String> lines) {

        return IntStream
                .range(0, lines.size())
                .mapToObj(i -> ++i + ": " + lines.get(i))
                .collect(Collectors.toList());
    }
}


/*
        List<String> res = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            res.add(++i + ": " + lines.get(i));
        }

        return res;
 */
