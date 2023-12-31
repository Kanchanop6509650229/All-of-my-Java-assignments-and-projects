//กาญจนพ บัวรอด
//6509650229

package Question1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import java.lang.Math;

public class SoilTempData implements ActionListener{
	private final int REPORT_ROUND = 10;
	private ArrayList<Integer> data;
	private int round , nextPrintIndex;
	private Timer time;
	private SoilTempIoT iot;
	
	public SoilTempData(SoilTempIoT iot) {
		data = new ArrayList<Integer>();
		time = new Timer(100,this) ;
		this.iot = iot;
		round = 0;
		nextPrintIndex = 0;
	}
	
	public void start() {
		printStat();
		time.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(round == REPORT_ROUND) {
			iot = new SoilTempIoT();
			printStat();
			round = 0;
		}
		else {
			data.add(iot.getTemp());
			round++;
		}
	}
	
	public void printStat() {
		float average = 0 , sdCal = 0 , sd = 0 , sum = 0 , min = 0 , max = 0 , allAverage = 0;
		System.out.println("********** Report Current Data: **********");
		System.out.printf("New set of data: ");
		if(round != 0) {
			min = data.get(0);
			max = data.get(0);
			for(int i = 0 ; i < round ; i++) {
				System.out.printf("%d, ", data.get(nextPrintIndex));
				if(min >= data.get(nextPrintIndex)) {
					min = data.get(nextPrintIndex);
				}
				if(max <= data.get(nextPrintIndex)){
					max = data.get(nextPrintIndex);
				}
				sum += data.get(nextPrintIndex);
				nextPrintIndex++;
			}
			average = (float)sum/(float)round;
			for(int eachData : data) {
				allAverage += (float)eachData;
			}
			allAverage /= (float)data.size();
			for(int i = 0 ; i < data.size() ; i++) {
				sdCal += (float)(Math.pow((float)(data.get(i) - allAverage), 2));
			}
			sd = (float)(Math.sqrt((float)1/(float)data.size() * sdCal));
		}
		System.out.println();
		System.out.printf("Total records: %d\n", data.size());
		if(round != 0) {
			System.out.printf("Statistics: \n\tMin = %.2f\n\tMax = %.2f\n\tAverage = %.2f\n\tSd = %.2f\n" , min , max , average , sd);
		}
		else {
			System.out.println("No data to report!");
		}
	}

}
