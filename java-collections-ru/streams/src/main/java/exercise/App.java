package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        long count = 0;
        if (emailsList != null) {
            count = emailsList.stream()
                    .filter(x -> x.contains("@gmail.com") || x.contains("@yandex.ru") || x.contains("@hotmail.com"))
                    .count();
        } else {
            System.out.println("List is null");
        }
        return count;
    }
}
// END
