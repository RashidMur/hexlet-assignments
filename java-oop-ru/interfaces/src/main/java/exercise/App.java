package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App{
    public static List<String> buildApartmentsList(List<Home> apartments, int n){
        List<String> result = new ArrayList<>();
        if (apartments.isEmpty()) {
            return result;
        }
        apartments.sort(Home::compareTo);
        for (var i = 0; i < n; i++) {
            result.add(apartments.get(i).toString());
        }
        return result;
    }
}
// END
