import java.util.Scanner;

public class SleepIn {

	/**
	 * @Rakesh Yadav
	 * 17 Feb 2015
	 * The parameter weekday is true if it is a weekday, and the
	 * parameter vacation is true is we are on vacation. We sleep
	 * in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 * 
	 * sleepInFun(false, false) -> true
	 * sleepInFun(true, false)  -> false
	 * sleepInFun(false, true)  -> true
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Day: ");
		String day = sc.next();
		System.out.println("Input true for vacation and false for not on vacation: ");
		boolean vacation = sc.nextBoolean();
		boolean weekday = false;
		
		if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")||day.equalsIgnoreCase("Friday")){
			weekday = true;
		}		
		
		boolean sleep = sleepInFun(weekday, vacation);
		if(sleep == true){
			System.out.println("No need to wakeup early in the morning");
		}
		else
			System.out.println("Please wake up, you need to go to office");
	}
	
	static boolean sleepInFun(boolean weekday, boolean vacation){
		if (weekday == false || vacation == true)
			return true;
		else
			return false;
	}

}
