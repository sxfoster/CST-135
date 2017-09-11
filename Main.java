//This was created by Stephan Foster and is my own work.
package homework;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		URL url = new URL("https://raw.githubusercontent.com/sxfoster/CST-135/master/flipFlapFlop.in");
		Scanner fileReader = new Scanner(new InputStreamReader(url.openStream()));
		//variable used to skip mandatory line in file based on requirement "Name and statement that work is one’s own included at top of EVERY file"
		String workDisclaimer = fileReader.nextLine();
		int stringNum = Integer.parseInt(fileReader.nextLine());
		
		String line;
		for(int x = 0; x < stringNum; x++) {
			line = fileReader.nextLine();
			System.out.printf("%-20s %-20s\n", line, isFlop(line));
		}
		fileReader.close();
	}

	public static boolean isFlip(String s) {
		if(s.length() < 2) {
			return false;
		}
		if(Character.toLowerCase(s.charAt(0)) != 'a') {
			return false;
		}
		if(Character.toLowerCase(s.charAt(1)) == 'h') {
			return true;
		}
		if(isFlap(s.substring(1)) || Character.toLowerCase(s.charAt(1)) == 'b' && isFlip(s.substring(2))) {
			int index = 3;
			while(index != s.length() && Character.toLowerCase(s.charAt(index)) != 'c') {
				index++;
			}
			
			if(index != s.length() && Character.toLowerCase(s.charAt(index)) == 'c') {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isFlap(String s) {
		if(s.length() < 3) {
			return false;
		}
		if(Character.toLowerCase(s.charAt(0)) != 'd' && Character.toLowerCase(s.charAt(0)) != 'e' || Character.toLowerCase(s.charAt(1)) != 'f') {
			return false;
		}
		
		int index = 2;
		while(index < s.length() && Character.toLowerCase(s.charAt(index)) == 'f') {
			index++;
		}
		if(index != s.length() && Character.toLowerCase(s.charAt(index)) == 'g') {
			return true;
		}
		
		if(isFlap(s.substring(index))) {
			return true;
		}
		
		return false;
			
	}
	public static boolean isFlop(String s) {
		if(isFlip(s)) {
			int index = 2;
			while(index < s.length() && Character.toLowerCase(s.charAt(index)) != 'd' && Character.toLowerCase(s.charAt(index)) != 'e') {
				index++;
			}			
			if(isFlap(s.substring(index))) {
				return true;
			}
			return false;
		}
		return false;
	}
}
