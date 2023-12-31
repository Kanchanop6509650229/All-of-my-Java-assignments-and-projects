//กาญจนพ บัวรอด
//6509650229

package Question1;
import java.util.*;
import javax.swing.*;

public class SoilTempDataTest {
	public static void main (String[] args) {
		SoilTempData sensor = new SoilTempData(new SoilTempIoT());
		sensor.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}
