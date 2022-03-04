package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StringFromFile {
    public static void main(String[] args) throws IOException {
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands.sorted()
                .filter(band -> band.length() > 10)
                .forEach(System.out::println);
        bands.close();
    }
}
