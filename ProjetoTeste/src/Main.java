import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-06-07");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		
		
		
		

	}

}
