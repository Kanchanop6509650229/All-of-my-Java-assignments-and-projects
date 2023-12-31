//กาญจนพ บัวรอด
//6509650229

package request3;
import java.io.*;
import java.util.*;
import java.lang.*;

public class DrinkReader {
	
	private ArrayList<Sellable> readerList;
	
	public DrinkReader() {
		readerList = new ArrayList<Sellable>();
	}
	
	public ArrayList<Sellable> getList() {
		return readerList;
	}
	
	public void readFileUI() throws DrinkReaderException {
		Scanner scan = new Scanner(System.in);
		boolean isOutOfLoop = false , isErrorFileType = true;
		String userInput = null;
		File inputFile = null;
		int errorCount = 0;
		
		while(!isOutOfLoop) {
			System.out.print("File containing drinks: ");
			userInput = scan.nextLine();
			
			while(isErrorFileType) {
				if(!(userInput.isBlank()) && userInput.charAt(userInput.length()-1) == '.') {
					errorCount++;
				}
				else {
					isErrorFileType = false;
				}
				
				if(isErrorFileType) {
					
					if(errorCount == 3) {
						throw new DrinkReaderException(userInput);
					}
					
					System.out.println("Try again! Cannot find the file " + userInput);

					System.out.print("File containing drinks: ");
					userInput = scan.nextLine();
				}
			}
			
			inputFile = new File(userInput);
			
			if(inputFile.exists()) {
				isOutOfLoop = true;
			}
			else {
				errorCount++;
				
				if(errorCount == 3) {
					throw new DrinkReaderException(userInput);
				}
				
				System.out.println("Try again! Cannot find the file " + userInput);
				
			}
			
			isErrorFileType = true;
			
		}
		
		readDrinks(inputFile);
		
	}
	
	public void readDrinks(File file) {
		
		String fileRead;
		
		try(Scanner inputFile = new Scanner(file)) {
			
			fileRead = inputFile.nextLine();
			
			while(inputFile.hasNext()) {
				
				fileRead = inputFile.nextLine();
				String[] splitRead = new String[4];
				splitRead = fileRead.split("::");
				Drink readItem = null;
				
				if(splitRead.length == 3) {
				    try {
				    	readItem = new Drink(splitRead[0] , splitRead[1] , Integer.parseInt(splitRead[2]) , false);
				    	readerList.add(readItem);
				    } catch (NumberFormatException e) {
				    	System.out.println("--Incorrect price skip: " + fileRead);
				    }
				}
				else if(splitRead.length == 4) {
					readItem = new Drink(splitRead[0] , splitRead[1] , Integer.parseInt(splitRead[2]) , Boolean.parseBoolean(splitRead[3]));
					readerList.add(readItem);
				}
				else {
					System.out.println("--Skip the item: " + fileRead);
				}
				
			}
			
		}
		
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}