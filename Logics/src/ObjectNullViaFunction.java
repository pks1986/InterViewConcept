import java.util.Calendar;

public class ObjectNullViaFunction {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		
		System.out.println("Current Time: " + calendar.getTimeInMillis()); 
		
		nullizeCalendar(calendar);
		
		if(calendar == null) {
			System.out.println("Calendar nullized");
		} else {
			System.out.println("Calendar not nullized, time Now: " + calendar.getTimeInMillis());
		}
		
	}
	
	static void nullizeCalendar(Calendar calendar) {
		calendar.setTimeInMillis(calendar.getTimeInMillis()+ 321);
		calendar = null;
	}

}
