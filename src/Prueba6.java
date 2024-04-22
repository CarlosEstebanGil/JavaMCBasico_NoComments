import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba6 {

	public Prueba6() {
	}

	public static void main(String[] args) {
		 
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		try {
			System.out.println("Ingrese un numero ENTERO: ");
			n= scanner.nextInt();
			
			switch (n) {
			case 0:
				System.out.println("elegiste 0");
				break;
			case 1:
				System.out.println("elegiste 1");
				break;
				
			default:
				System.out.println("elegiste un entero distinto a 1 ");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Error en la entrada. DEBE INGRESAR UN NUMERO ENTERO");
		}
		

		Calendar calendario = Calendar.getInstance(); 
		
		int anio = calendario.get(Calendar.YEAR);
		
		System.out.println(anio); 
		
		
		Calendar calGreg = new GregorianCalendar(); 
													
		
		  calGreg = new GregorianCalendar(2015,Calendar.DECEMBER,25);
		  System.out.println("calgreg: " + calGreg.getTime().toString()); 

		  int mes = calGreg.get(Calendar.MONTH); 
		  System.out.println("mes: " + Integer.toString(mes));
		
		  
		  LocalDate date = LocalDate.of(1989, 11, 11); 
		  System.out.println(date.getYear()); 
		  System.out.println(date.getMonth()); 
		  System.out.println(date.getDayOfMonth()); 
		  

		   date = LocalDate.of(1989, Month.NOVEMBER, 11);
		  

		   date = LocalDate.now();
		   
		   
		   LocalTime time = LocalTime.of(5, 30, 45, 35); 
		   System.out.println(time.getHour()); 
		   System.out.println(time.getMinute()); 
		   System.out.println(time.getSecond()); 
		   System.out.println(time.getNano()); 


		   time = LocalTime.now();
		   
		   
		   LocalDateTime dateTime = LocalDateTime.of(1989, 11, 11, 5, 30, 45, 35); 

			    date = LocalDate.of(1989, 11, 11);
			    time = LocalTime.of(5, 30, 45, 35);
			    dateTime = LocalDateTime.of(date, time);
			  

			    dateTime = LocalDateTime.now();
			    

		    LocalTime localTime1 = LocalTime.of(12, 25);
			LocalTime localTime2 = LocalTime.of(17, 35);
			Duration duration = Duration.between(localTime1, localTime2);
			

				Duration oneDayDuration = Duration.ofDays(1);
				

				LocalDate localDate1 = LocalDate.of(2016, Month.JULY, 18);
				LocalDate localDate2 = LocalDate.of(2016, Month.JULY, 20);
				Period period = Period.between(localDate1, localDate2);
				

				period = Period.of(1, 2, 3);
				

				period = Period.ofYears(1);
				

				LocalDate myDate = LocalDate.of(2016, Month.JULY, 25); 
				LocalDate date1 = myDate.withYear(2017); 
				LocalDate date2 = myDate.withMonth(8); 
				LocalDate date3 = myDate.withDayOfMonth(27); 
				LocalDate date4 = myDate.with(ChronoField.MONTH_OF_YEAR, 9); 
				
				
				LocalDateTime myDateTime = LocalDateTime.of(2016, Month.JULY, 25, 22, 11, 30);
				LocalDateTime dateTime1 = myDateTime.withYear(2017);
				LocalDateTime dateTime2 = myDateTime.withMonth(8);
				LocalDateTime dateTime3 = myDateTime.withDayOfMonth(27);
				LocalDateTime dateTime4 = myDateTime.withHour(20);
				LocalDateTime dateTime5 = myDateTime.withMinute(25);
				LocalDateTime dateTime6 = myDateTime.withSecond(23);
				LocalDateTime dateTime7 = myDateTime.withNano(24);
				LocalDateTime dateTime8 = myDateTime.with(ChronoField.HOUR_OF_DAY, 23);
				
				

				date = LocalDate.of(2016, Month.JULY, 18);
				LocalDate datePlusOneDay = date.plus(1, ChronoUnit.DAYS);
				LocalDate dateMinusOneDay = date.minus(1, ChronoUnit.DAYS);
				

				date = LocalDate.of(2016, Month.JULY, 18);
				datePlusOneDay = date.plus(Period.ofDays(1));
				dateMinusOneDay = date.minus(Period.ofDays(1));
				

				date = LocalDate.of(2016, Month.JULY, 18);
				datePlusOneDay = date.plusDays(1);
				dateMinusOneDay = date.minusDays(1);
				
				
				time = LocalTime.of(15, 30);
				LocalTime timePlusOneHour = time.plus(1, ChronoUnit.HOURS);
				LocalTime timeMinusOneHour = time.minus(1, ChronoUnit.HOURS);
				
				 time = LocalTime.of(15, 30);
				 timePlusOneHour = time.plus(Duration.ofHours(1));
				 timeMinusOneHour = time.minus(Duration.ofHours(1));
				

				 time = LocalTime.of(15, 30);
				 timePlusOneHour = time.plusHours(1);
				 timeMinusOneHour = time.minusHours(1);
				

				 date1 = LocalDate.of(2016, Month.JULY, 28);
				 date2 = LocalDate.of(2016, Month.JULY, 29);

				 boolean isBefore = date1.isBefore(date2); //true
				 boolean isAfter = date2.isAfter(date1); //true
				 boolean isEqual = date1.isEqual(date2); //false
				 

				 date = LocalDate.of(2016, Month.JULY, 25);
				 
				 String dateStr1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); //20160725
				 String dateStr2 = date.format(DateTimeFormatter.ISO_DATE); //2016-07-25
				 

				 date = LocalDate.of(2016, Month.JULY, 25);
				 String dateStr3 = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")); //2016/07/25
				 
				 
				 

				 
				 java.time.Instant instant = Instant.now();
				 java.sql.Timestamp timestampSql = java.sql.Timestamp.from(instant);
				 
				 
				 LocalDate locald = LocalDate.of(1967, 06, 22);
				 java.sql.Date dateSql = java.sql.Date.valueOf(locald); // aca se usa valueOf
				 
				 
				 LocalTime now = LocalTime.now();
				 
			     java.sql.Time timeSql = java.sql.Time.valueOf( now );
			         
			     System.out.println(time);
			     
			     
			     java.sql.Time.valueOf(LocalTime.now()).toLocalTime(); //toLocaTime es el metodo!
			     
			     
			     java.sql.Timestamp timestampSql2 = java.sql.Timestamp.valueOf(LocalDateTime.now());
			     
			     java.time.Instant instant2 = timestampSql2.toInstant(); //toInstant es el metodo!
			         

	}

}
