import java.util.Scanner;

public class Calculo {

	
	public static void main(String[] args) {
		Operacoes o = new Operacoes();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um valor para a operação");
		int n1 = scanner.nextInt();
		System.out.println("digite outro valor para a operação");
		int n2 = scanner.nextInt();
		
		o.divisao(n1,n2);
		
		System.out.println("digite um valor para a operação");
		int n3 = scanner.nextInt();
		System.out.println("digite outro valor para a operação");
		int n4 = scanner.nextInt();
		
		o.soma(n3,n4);
		
		System.out.println("digite um valor para a operação");
		int n5 = scanner.nextInt();
		System.out.println("digite outro valor para a operação");
		int n6 = scanner.nextInt();
		
		o.mutiplicacao(n5,n6);
		
		System.out.println("digite um valor para a operação");
		int n7 = scanner.nextInt();
		System.out.println("digite outro valor para a operação");
		int n8 = scanner.nextInt();
		
		o.subtracao(n7,n8);
		
	}
}