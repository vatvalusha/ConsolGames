package home.mass;

import java.util.Scanner;

public class GameMassUpgreate {
	public static void main(String[] args) {
		int size = 10;
		int vertical = 0;
		int contour = 0;
		int apt = 0;
		int boom = 0;
		System.out.println("S.T.A.R.T.");
		System.out.println("You have HP 60% ");
		apt = (int)((Math.random()*8)+1);
		boom = (int)((Math.random()*8)+1);
		int aspirin =  (int)((Math.random()*2)+1);
		switch(aspirin){
			case 1:
				System.out.println("Medicine chest HP:20%");
				break;
			case 2:
				System.out.println("medicine chest HP: 40%");
				break;
		}
		
		char[][] word = new char[size][size];
		for(int i = 0; i<size; i++){
			for(int j =0; j<size; j++){
				word[i][j] = '_';	
			}
		}
		word[boom][boom] = '\uDCA3';
		word[apt][apt] = '+';
		word[0][0] = '|';
		
		for(int i = 0; i<size; i++){
			for(int j =0; j<size; j++){
				System.out.print(word[i][j] + " ");
			}
			System.out.println();
		}
		while(true){
			Scanner in = new Scanner(System.in);
			switch (in.nextLine()) {
			case "a":
				if(contour!=0){
				word[vertical][contour] = '_';
				word[vertical][--contour] = '|';
				}
				break;
			case "d":
				if(contour!=9){
				word[vertical][contour] = '_';
				word[vertical][++contour] = '|';
				}
				break;
			case "w":
				if(vertical!=0){
				word[vertical][contour] = '_';
				word[--vertical][contour] = '|';
				}
				break;
			case "s":
				if(vertical!=9){
				word[vertical][contour] = '_';
				word[++vertical][contour] = '|';
				}
				break;
			}
			if(word[vertical][contour] == word[apt][apt]){
				System.out.println("you picked aspirin");
				if(aspirin == 1)
					System.out.println("now your HP: 80%");
				else if (aspirin == 2)
					System.out.println("now your HP: 100%");
			}
			
			for(int i = 0; i<size; i++){
				for(int j =0; j<size; j++){
					System.out.print(word[i][j] + " ");
				}
				System.out.println();
			}
			if(word[vertical][contour] == word[boom][boom]){
				System.out.println("B.O.O.O.O.M. Y.O.U. A.R.E. D.I.E.");
				break;
			}
			if(word[9][9] == '|'){
				System.out.println("G.A.M.E. O.V.E.R.");
				break;
			}
		}
	}
}
