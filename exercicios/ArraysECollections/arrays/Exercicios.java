package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA [0] = 6.5;
		notasAlunoA [1] = 7.2;
		notasAlunoA [2] = 4.8;
		notasAlunoA [3] = 9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[2]);
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println(total / 4);
	}   
}       
        