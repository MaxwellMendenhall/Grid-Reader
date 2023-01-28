package main;

import java.util.Scanner;

public class GameFileTester {
	
	static int response;
	Scanner s = new Scanner(System.in);
	
	public GameFileTester() throws Exception {
		Position();
	}
	
	public int Position() throws Exception {
		System.out.println("The gird has 9 spaces \n"
				+ "input a number from 1-9 \nto pick your space \n");
		response = s.nextInt();
		
		return response;
	}
	public static void main(String[] args) throws Exception {
		
		String fileName="/Users/maxwellmendenhall/eclipse-workspace/GridReader/src/main/PlaceHolder.txt";
		GridReader reader= new GridReader(fileName);
		
		reader.getGrid();
		
		System.out.println("The Grid:");
		System.out.println(reader);
		@SuppressWarnings("unused")
		GameFileTester gft = new GameFileTester();
		//System.out.println(reader.getGrid()[1][1]);
		switch(response) {
		case 1: reader.getGrid()[0][0]='X'; break;
		case 2: reader.getGrid()[0][1]='X'; break;
		case 3: reader.getGrid()[0][2]='X'; break;
		case 4: reader.getGrid()[1][0]='X'; break;
		case 5: reader.getGrid()[1][1]='X'; break;
		case 6: reader.getGrid()[1][2]='X'; break;
		case 7: reader.getGrid()[2][0]='X'; break;
		case 8: reader.getGrid()[2][1]='X'; break;
		case 9: reader.getGrid()[2][2]='X'; break;
		}
		for(char[] row : reader.getGrid()) {
			for(char c: row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
