/* กาญจนพ บัวรอด
 * 6509650229
 */

package Question1;

import java.util.Scanner;

public class TestFourWords {
	
	public static void main(String[] args) {
		
		FourWords words4 = new FourWords();
		Scanner scanner = new Scanner(System.in);
		
		words4.printWords(); //display ค่า เพื่อโชว์ว่ายังไม่มีการรับค่า ให้แสดงผลเป็น null
		for(int i = 1; i <= 5 ; i++) {
		//loop for เพื่อทำการรันคำสั่ง 5 ครั้ง
			System.out.print("Enter your word: ");
			String userInput = scanner.next();
			words4.add(userInput); //รับค่าที่ user ป้อนเข้าไปเป็น parameter ให้ method add เพื่อเปลี่ยนค่าตัวแปร word ของ class FourWords
			words4.printWords(); //display ค่าออกมา
		} 
	}
}
