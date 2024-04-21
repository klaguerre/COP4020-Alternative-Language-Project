import org.junit.Test;
import static org.junit.Assert.*;

// For testing
public class CellTest {
  @Test
  public void testCellCreation() {
    cell cell = new Cell("Apple", "iPhone X", 2017, "Available", "143.6 x 70.9 x 7.7 mm", 174f, "Nano-SIM",
        "Super AMOLED", 5.8f, "1125 x 2436 pixels", "Face ID, accelerometer, gyro, proximity, compass, barometer",
        "iOS 11, upgradable to iOS 13.3");
    assertNotNull(cell);
    assertEquals("Apple", cell.getOem());
  }
}