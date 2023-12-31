/* กาญจนพ บัวรอด
 * 6509650229
 */

package Question1;

public class FourWords {
	
	private String word1 = "" , word2 = "" , word3 = "" , word4 = "";
	private int count = 0;
	
	public void add(String word) {
	/* 
	 * method add สำหรับการรับ scanner string เข้ามาจาก main class
	 * โดยใช้ function if,else if เพื่อตรวจสอบว่าในตัวแปร string word1 มีตัวอักษรอยู่หรือไม่ 
	 * ถ้าไม่มีแสดงว่า word1 ยังมีค่าเป็นช่องว่าง("")ตามที่ได้ประกาศตัวแปรไว้
	 * ถ้าเป็นช่องว่างจะส่งผลให้เงื่อนไขเป็นจริง และทำการรันคำสั่งเพื่อรับค่า parameter เข้าไปในตัวแปร word ทั้ง 4 ตัว พร้อมกับทำการนับจำนวนตัวอักษรเข้าไป
	 * เช่นในตอนแรก word1-4 จะมีค่าเป็น "" เมื่อรับค่า parameter เข้ามาครั้งแรก จะส่งผลให้ผ่านเงื่อนไข if ของ word1 และรับค่าเข้าไปใน word1
	 * โดยจะไม่มีการรับค่า word2-4 เนื่องจากเป็นการใช้ else if ดังนั้นเมื่อเงื่อนไข word1 ผ่านจึงไม่ทำการรับค่า word2-4
	 * เมื่อรับ parameter เข้ามาครั้งที่สอง ตัว word1 ไม่ใช่ค่าว่างเปล่าแล้ว จึงไม่ผ่านเงื่อนไข แล้วข้ามไปเช็คเงื่อนไข word2 ต่อ ซึ่งยังไม่มีค่า จึงทำการรับค่าเข้าไปใน word2 แล้ววนไปเรื่อยๆจนครบ 5 รอบ
	 * เมื่อรับค่ามาครบ 4 ตัวจะทำให้ if และ else if ทั้งหมดเป็นเท็จ จึงข้ามไปทำคำสั่งที่ else เพื่อแสดงว่าไม่สามารถรับค่าเข้าไปได้แล้ว
	 */
		if(word1.equals("")) {
			word1 = word;
			count += word1.length();
		}
		else if(word2.equals("")) {
			word2 = word;
			count += word2.length();
		}
		else if(word3.equals("")) {
			word3 = word;
			count += word3.length();
		}
		else if(word4.equals("")) {
			word4 = word;
			count += word4.length();
		}
		else {
			System.out.printf("Can't add a new word %s!",word);
		}
	}
	
	public String getMin() {
	/*
	 * method getMin สำหรับการหาค่าที่น้อยที่สุด โดยกำหนดตัวแปร min ขึ้นมาใหม่ให้มีค่าว่างเปล่า("")
	 * หลังจากนั้นจะทำการเช็คเงื่อนไขว่ามีการรับคำเข้ามาหรือไม่โดยการเช็คที่ count = 0 เนื่องจากหากยังไม่มีการรับค่า count ก็จะไม่มีการนับจำนวนตัวอักษร ทำให้มีค่า = 0 ทำให้ return ค่า min ไปว่า null
	 * แต่ถ้า count != 0 ซึ่งจะไปรันคำสั่งของ else โดยกำหนดค่า min = word1 เอาไว้ แล้วทำการเช็คเงื่อนไขด้วย .compareTo() ซึ่งเป็นการเปรียบเทียบตัวอักษร
	 * โดยให้เช็คไปว่า min มีค่ามากกว่าหรือเท่ากับ word1-4 หรือไม่ โดยที่ word1-4 จะเป็นค่าว่าง("") ไม่ได้ หากมีค่ามากกว่าจะ return ตัวเลขที่มากกว่า 0 เข้ามาทำให้ผ่านเงื่อนไข และ min จะเปลี่ยนเป็นตัวนั้นแทน
	 */
		String min = "";
		if(count == 0) {
			min = null;
		}
		else {
			min = word1;
			if (min.compareTo(word1) >= 0 && !word1.equals("")) {
				min = word1;
			}
			if (min.compareTo(word2) >= 0 && !word2.equals("")) {
				min = word2;
			}
			if (min.compareTo(word3) >= 0 && !word3.equals("")) {
				min = word3;
			}
			if (min.compareTo(word4) >= 0 && !word4.equals("")) {
				min = word4;
			}
		}
		return min;
	}
	
	public String getMax() {
		/*
		 * method getMax สำหรับการหาค่าที่น้อยที่สุด โดยกำหนดตัวแปร max ขึ้นมาใหม่ให้มีค่าว่างเปล่า("")
		 * หลังจากนั้นจะทำการเช็คเงื่อนไขว่ามีการรับคำเข้ามาหรือไม่โดยการเช็คที่ count = 0 เนื่องจากหากยังไม่มีการรับค่า count ก็จะไม่มีการนับจำนวนตัวอักษร ทำให้มีค่า = 0 ทำให้ return ค่า min ไปว่า null
		 * แต่ถ้า count != 0 ซึ่งจะไปรันคำสั่งของ else โดยกำหนดค่า max = word1 เอาไว้ แล้วทำการเช็คเงื่อนไขด้วย .compareTo() ซึ่งเป็นการเปรียบเทียบตัวอักษร
		 * โดยให้เช็คไปว่า max มีค่าน้อยกว่าหรือเท่ากับ word1-4 หรือไม่ โดยที่ word1-4 จะเป็นค่าว่าง("") ไม่ได้ หากมีค่าน้อยกว่าจะ return ตัวเลขที่น้อยกว่า 0 เข้ามาทำให้ผ่านเงื่อนไข และ max จะเปลี่ยนเป็นตัวนั้นแทน
		 */
		String max = "";
		if(count == 0) {
			max = null;
		}
		else {
			max = word1;
			if (max.compareTo(word1) <= 0 && !word1.equals("")) {
				max = word1;
			}
			if (max.compareTo(word2) <= 0 && !word2.equals("")) {
				max = word2;
			}
			if (max.compareTo(word3) <= 0 && !word3.equals("")) {
				max = word3;
			}
			if (max.compareTo(word4) <= 0 && !word4.equals("")) {
				max = word4;
			}
		}
		return max;
	}
	
	public void printWords() {
	//method printWords เพื่อแสดงค่า string ที่มีค่าน้อยที่สุด,มากที่สุด,จำนวนตัวอักษรทั้งหมด และค่าเฉลี่ยจำนวนตัวอักษร
		double averageLength = 0D;
		if(word1.equals("") && word2.equals("") && word3.equals("") && word4.equals("")) {
		//ใช้ if เพื่อเช็คว่ามีการรับค่า string มาหรือไม่ ถ้าไม่มีให้แสดงข้อความที่กำหนด
			System.out.println("No words set up yet!");
		}
		System.out.println("List of words: ");
		if(!word1.equals("")) {
		/*
		 * หากตัวแปร word1 มีการรับค่าเข้ามาแล้ว ให้แสดงค่าที่รับมาออกไป 
		 * และเปลี่ยนค่าในตัวแปรค่าเฉลี่ย(averageLength)ด้วยการนำจำนวนตัวอักษรทั้งหมดที่ได้จากตัวแปร count(word1) หารด้วยจำนวนค่าที่รับมา(1)
		 */
			System.out.println("\t" + word1);
			averageLength = (double)count/1D ;
		}
		if(!word2.equals("")) {
		/*
		 * หากตัวแปร word2 มีการรับค่าเข้ามาแล้ว ให้แสดงค่าที่รับมาออกไป 
		 * และเปลี่ยนค่าในตัวแปรค่าเฉลี่ย(averageLength)ด้วยการนำจำนวนตัวอักษรทั้งหมดที่ได้จากตัวแปร count(word1+word2) หารด้วยจำนวนค่าที่รับมา(2)
		 */
			System.out.println("\t" + word2);
			averageLength = (double)count/2D ;
		}
		if(!word3.equals("")) {
		/* 
		 * หากตัวแปร word3 มีการรับค่าเข้ามาแล้ว ให้แสดงค่าที่รับมาออกไป 
		 * และเปลี่ยนค่าในตัวแปรค่าเฉลี่ย(averageLength)ด้วยการนำจำนวนตัวอักษรทั้งหมดที่ได้จากตัวแปร count(word1+word2+word3) หารด้วยจำนวนค่าที่รับมา(3)
		 */
			System.out.println("\t" + word3);
			averageLength = (double)count/3D ;
		}
		if(!word4.equals("")) {
		/*
		 * หากตัวแปร word4 มีการรับค่าเข้ามาแล้ว ให้แสดงค่าที่รับมาออกไป 
		 * และเปลี่ยนค่าในตัวแปรค่าเฉลี่ย(averageLength)ด้วยการนำจำนวนตัวอักษรทั้งหมดที่ได้จากตัวแปร count(word1+word2+word3+word4) หารด้วยจำนวนค่าที่รับมา(4)
		 */
			System.out.println("\t" + word4);
			averageLength = (double)count/4D ;
		}
		System.out.println();
		System.out.printf("The lexicographic minimum is %s%n",getMin());
		System.out.printf("The lexicographic maximum is %s%n",getMax());
		System.out.printf("Total length %d%n", count);
		System.out.printf("Average length %f%n", averageLength);
		System.out.println();
	}
}