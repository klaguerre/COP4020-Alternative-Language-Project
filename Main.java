import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CellPhoneDataProcessor processor = new CellPhoneDataProcessor();
        HashMap<String, cell> phones = processor.readAndProcessCSV("cells.csv");

        for (cell phone : phones.values()) {
            System.out.println(phone);
        }
    }
}