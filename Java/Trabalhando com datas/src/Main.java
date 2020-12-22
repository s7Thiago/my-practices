import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		String separator = "----------------------------------------";

		System.out.println(separator + " Sec�o 1 " + separator + "\n");
		Date date = new Date();

//		Imprimindo no conlole a hora e data atuais
		System.out.println("Hora e data atuais com date: \n" + date + "\n" + separator + "\n");

//		Definindo a m�scara que ir� formatar a data
		SimpleDateFormat format1 = new SimpleDateFormat("dd/mm/yyyy");

//		Imprimindo a data formatada com a m�scara definida
		System.out.println("Mesma data formatada com m�scara \n" + format1.format(date) + "\n" + separator + "\n");

		/*
		 * A classe Date atualmente est� em desuso por possuir diversos m�todos marcados
		 * como deprecated. A mais usada hoje em dia � a classe abstrata Calendar
		 */

		// Exibindo a data e hora atual atrav�s da classe Calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println("Hora e data atuais com Calendar:\n" + calendar.getTime() + "\n" + separator + "\n");

//		Manipulando outros aspectos atrav�s da classe Calendar

//		Imprimindo o ano
		System.out.println("Ano, m�s de dia atuais com Calendar:\nAno: " + calendar.get(Calendar.YEAR));

//		Imprimindo o dia
		System.out.println("M�s: " + calendar.get(Calendar.MONTH));

//		Imprimindo o m�s
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH) + "\n" + separator + "\n");

//		Manipulando os valores de tatas com Calendar

		calendar.set(Calendar.YEAR, 1997);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DAY_OF_MONTH, 04);

//		Imprimindo o ano setado
		System.out.println("Ano, m�s de dia manipulados com Calendar:\nAno: " + calendar.get(Calendar.YEAR));

//		Imprimindo o dia setado
		System.out.println("M�s: " + calendar.get(Calendar.MONTH));

//		Imprimindo o m�s setado
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH) + "\n" + separator + "\n");

//		Fazendo uma intera��o com o usu�rio de acordo com a hora do dia
		calendar = Calendar.getInstance(); // Redefinindo os valores padr�es
		int hora = calendar.get(Calendar.HOUR_OF_DAY);

		System.out.println("Hora: " + hora);
		if ((hora > 5 && hora < 12)) {
			System.out.println("Bom dia, usu�rio");
		}

		else if ((hora < 19 && hora > 12)) {
			System.out.println("Boa tarde, usu�rio");
		}

		else {
			System.out.println("Boa noite, usu�rio");
		}

		System.out.println(separator + " Sec�o 2 " + separator + "\n");
//		Formatando datas do tipo Date com DateFormat
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(1997, Calendar.APRIL, 4);

		Date data2 = calendar.getTime();
		
		System.out.println("Data atual sem formata��o:\n" + data2);
		
//		Formatando a data
		DateFormat formatadorDeData = DateFormat.getDateInstance();
		
		System.out.println("\nData atual com formata��o:\n" + formatadorDeData.format(data2));
		
//		Formatando a hora
		DateFormat formatadorDeHora = DateFormat.getTimeInstance();
		System.out.println("\nHora com formata��o:\n" + formatadorDeHora.format(data2));
		
//		Formatando data e hora
		DateFormat formatarDataEHora = DateFormat.getDateTimeInstance();
		System.out.println("\nData e hora com formata��o:\n" + formatarDataEHora.format(data2));
		
//		Data brasileira completa
		DateFormat dataCompleta = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("\nData brasileira completa:\n" + dataCompleta.format(data2));
		
//		Data sem o dia descrito
		dataCompleta = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("\nData sem o dia descrito:\n" + dataCompleta.format(data2));
		
//		Data resumida
		dataCompleta = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("\nData resumida 1:\n" + dataCompleta.format(data2));
		
//		Data resumida 2
		dataCompleta = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("\nData resumida 2:\n" + dataCompleta.format(data2) + "\n" + separator + "\n");
		
//		Convertendo informa��es do tipo String para datas
		
		

	}

}
