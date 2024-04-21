import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Reading and cleaning data
public class CellPhoneDataProcessor {
    public HashMap<String, cell> readAndProcessCSV(String filePath) {
        HashMap<String, cell> phoneMap = new HashMap<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            reader.readNext(); // Skip header line
            while ((nextLine = reader.readNext()) != null) {
                String oem = nextLine[0].equals("-") ? null : nextLine[0];
                String model = nextLine[1].equals("-") ? null : nextLine[1];
                Integer launchAnnounced = extractYear(nextLine[2]);
                String launchStatus = nextLine[3].matches("Discontinued|Cancelled") ? nextLine[3]
                        : extractYear(nextLine[3]).toString();
                String bodyDimensions = nextLine[4].equals("-") ? null : nextLine[4];
                Float bodyWeight = extractWeight(nextLine[5]);
                String bodySim = nextLine[6].equalsIgnoreCase("No") ? null : nextLine[6];
                String displayType = nextLine[7].equals("-") ? null : nextLine[7];
                Float displaySize = extractDisplaySize(nextLine[8]);
                String displayResolution = nextLine[9].equals("-") ? null : nextLine[9];
                String featuresSensors = nextLine[10].equals("V1") ? null : nextLine[10];
                String platforms = extractOs(nextLine[11]);

                cell cell = new cell(oem, model, launchAnnounced, launchStatus, bodyDimensions, bodyWeight, bodySim,
                        displayType, displaySize, displayResolution, featuresSensors, platforms);
                phoneMap.put(oem + " " + model, cell);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phoneMap;
    }

    private Integer extractYear(String data) {
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        }
        return null;
    }

    private Float extractWeight(String data) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            return Float.parseFloat(matcher.group());
        }
        return null;
    }

    private Float extractDisplaySize(String data) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            return Float.parseFloat(matcher.group());
        }
        return null;
    }

    private String extractOs(String data) {
        return data.split(",")[0];
    }
}