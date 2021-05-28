package testes;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Teste05_Datev2 {

	public static void main(String[] args) {

		/* Teste com data e hora part 2 */

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2021-05-28T02:03:00Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println(sdf.format(d));

		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);

		System.out.println(minutes);

	}

}
