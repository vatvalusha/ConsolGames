package home.mass;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int size = 0;
//		int i = 0;
//		System.out.println("Specify the size of the arrays:");
//		size = scanner.nextInt();
		
		String[] name= new String[3];
//		String[] surname= new String[3];
//		String[] patronymic= new String[3];
		String text;
	    text = scanner.nextLine();
	    name = text.split(" ");
        for(int i = 0;i<name.length;i++){
        	System.out.println(name[i]);
        }

		while(true){
			if(text.equals("3")) break;
			text = scanner.nextLine();
			name = text.split(" ");
			System.out.println("FIO: ");
		    for(int i = 0;i<name.length;i++){
		        System.out.println(name[i]);
		    }
		    
			
//			System.out.println("Fill the Surame ["+ i + "]: ");
//			text = scanner.nextLine();
//			if(text.equals("3")){
//				break;
//			}
//			surname[i] = text;
//			System.out.println("Fill the Name ["+ i + "]: ");
//			text = scanner.nextLine();
//			if(text.equals("3")){
//				break;
//			}
//			name[i] = text;
//			System.out.println("Fill the Patronymic ["+ i + "]: ");
//			text = scanner.nextLine();
//			if(text.equals("3")){
//				break;
//			}
//			patronymic[i] = text;
//			i++;
//			if(i == 3) break;
//			System.out.println("Fill the FIO1 ["+ i + "]: ");
//			text = scanner.nextLine();
//			if(text.equals("3")){
//				break;
//			}
//		}
//		System.out.println(Arrays.deepToString(name));
//		System.out.println(Arrays.deepToString(surname));
//		System.out.println(Arrays.deepToString(patronymic));
		}
	}
}
