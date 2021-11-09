package Familia38;

import java.util.Scanner;

public class LacosExerc1 {
	public static void main(String[] args) {
		
		int n1,n2,n3,maiorNum=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		n1=ler.nextInt();
		System.out.println("Entre com o segundo numero: ");
		n2=ler.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		n3=ler.nextInt();
		
		if (n1 >maiorNum)
		{
			maiorNum=n1;
			if (maiorNum <n2)
			{
				maiorNum=n2;
			}
			if (maiorNum <n3)
			{
				maiorNum=n3;
			}
		}
		
		
		System.out.println("O maior numero é: "+maiorNum);
	}

}
