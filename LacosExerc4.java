package Familia38;

import java.util.Scanner;

public class LacosExerc4 {
	public static void main(String[] args) {
		
		double num,numPar,raizPar, numImpar, quadImpar;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um numero");
		num= ler.nextDouble();
		
		if (num%2 ==0)
		{
			numPar=num;
			System.out.println("O Numero "+numPar+" é par");
			raizPar=Math.sqrt(numPar);
			System.out.println("A raiz quadrada do numero " +numPar+" é de: "+raizPar);
		}
		else
		{
			numImpar=num;
			System.out.println("O Numero "+numImpar+" é impar");
			quadImpar= Math.pow(numImpar,2);
			System.out.println("O numero" +numImpar+"elevado ao quadrado da o resultado: " +quadImpar);
		}
	}

}
