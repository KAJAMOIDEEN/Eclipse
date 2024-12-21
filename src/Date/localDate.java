package Date;

import java.time.*;
import java.time.format.*;

public class localDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate obj = LocalDate.of(2024, 7, 14);

		System.out.println(obj.now());

		LocalDateTime ob = LocalDateTime.now();

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = ob.format(myFormatObj);

		System.out.println(formattedDate);

	}

}
