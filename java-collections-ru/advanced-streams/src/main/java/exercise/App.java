package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {

    public static String getForwardedVariables(String confFile) {
        String[] lineConfig = confFile.split("\n");
        return Arrays.stream(lineConfig)
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceFirst("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));

    }


}
//END
