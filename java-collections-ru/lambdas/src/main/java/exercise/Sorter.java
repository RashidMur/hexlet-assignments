package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users){
        return users.stream()
                .filter(man -> man.get("gender").equals("male"))
                .sorted((bir1, bir2) -> bir1.get("birthday").compareTo(bir2.get("birthday")))
                .map(man -> man.get("name"))
                .collect(Collectors.toList());
    }
}
// END
