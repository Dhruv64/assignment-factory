package edu.neu.csye6200;

import java.io.*;
import java.util.*;

public class FileUtil {
    public static List<String> readCustomFile(String customFilename) throws IOException {
        List<String> customLines = new ArrayList<>();
        try (BufferedReader customReader = new BufferedReader(new FileReader(customFilename))) {
            String customLine;
            while ((customLine = customReader.readLine()) != null) {
                customLines.add(customLine);
            }
        }
        return customLines;
    }

    public static void writeCustomFile(String customFilename, List<String> customLines) throws IOException {
        try (BufferedWriter customWriter = new BufferedWriter(new FileWriter(customFilename))) {
            for (String customLine : customLines) {
                customWriter.write(customLine);
                customWriter.newLine();
            }
        }
    }
}
