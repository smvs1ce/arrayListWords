import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		String sentence = "Hamburgers are great!";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		System.out.println(words);
	}

  }
