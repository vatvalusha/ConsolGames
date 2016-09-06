package home.mass;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Input size array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		char[][] square = new char [size][size];
		if(size%2 != 0){
			for(int i = 0; i<size; i++){
				for(int j =0; j<size; j++){
					if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
						square[i][j] = '#';
			            }
					square[size/2][size/2] = '#';
					square[(size/2)+1][size/2] = '#';
					square[size/2][(size/2) + 1] = '#';
					square[(size/2) - 1][size/2] = '#';
					square[size/2][(size/2) - 1] = '#';
				}
			}
			for(int i = 0; i<size; i++){
				for(int j =0; j<size; j++){
					System.out.print(square[i][j]+ " ");
				}
				System.out.println();
			}
		}
		else{
			for(int i = 0; i<size; i++){
				for(int j =0; j<size; j++){
					if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
						square[i][j] = '#';
			            }
					square[size/2][size/2] = '#';
					square[size/2 - 1][size/2 - 1] = '#';
					square[size/2 - 1][size/2 ] = '#';
					square[size/2 ][size/2 - 1] = '#';
//					square[size/2][size/2] = '#';
				}
			}
			for(int i = 0; i<size; i++){
				for(int j =0; j<size; j++){
					System.out.print(square[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}

}
