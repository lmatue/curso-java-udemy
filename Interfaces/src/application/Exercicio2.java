package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model_entities.Contract;
import model_entities.Installment;
import model_services.ContractService;
import model_services.PaypalService;

public class Exercicio2 {
	
	/*
	 * Uma empresa deseja automatizar o processamento de seus contratos. O
	 * processamento de um contrato consiste em gerar as parcelas a serem pagas para
	 * aquele contrato, com base no n�mero de meses desejado. A empresa utiliza um
	 * servi�o de pagamento online para realizar o pagamento das parcelas. Os
	 * servi�os de pagamento online tipicamente cobram um juro mensal, bem como uma
	 * taxa por pagamento. Por enquanto, o servi�o contratado pela empresa � o do
	 * Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de
	 * pagamento de 2%. Fazer um programa para ler os dados de um contrato (n�mero
	 * do contrato, data do contrato, e valor total do contrato). Em seguida, o
	 * programa deve ler o n�mero de meses para parcelamento do contrato, e da�
	 * gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira
	 * parcela a ser paga um m�s ap�s a data do contrato, a segunda parcela dois
	 * meses ap�s o contrato e assim por diante. Mostrar os dados das parcelas na
	 * tela. Veja exemplo na pr�xima p�gina.
	 */

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		Contract contract = new Contract(number, date, contractValue);

		System.out.print("Enter number of installments: ");
		int N = sc.nextInt();

		ContractService cs = new ContractService(new PaypalService());

		cs.processContract(contract, N);

		System.out.println("Installments: ");

		for (Installment it : contract.getInstallments()) {

			System.out.println(it);

		}

		sc.close();
	}

}
