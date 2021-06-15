package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Teste04_Date {

	public static void main(String[] args) throws ParseException {
		
		/*Teste Com Datas e Horas part 1*/
		
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("28/05/2021");
		Date y2 = sdf2.parse("28/05/2021 01:33:00");
		Date y3 = Date.from(Instant.parse("2021-05-28T01:45:00Z"));
		
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));
		System.out.println(sdf3.format(y3));
		
		System.out.println("-------------");
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		

	}

}
