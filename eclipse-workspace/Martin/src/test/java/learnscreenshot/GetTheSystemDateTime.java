package learnscreenshot;

import java.time.LocalDateTime;

public class GetTheSystemDateTime {
public static void main(String[] args) {
	 LocalDateTime dateAndTime =LocalDateTime.now();
	 System.out.println(dateAndTime);
	 String seeHere = dateAndTime.toString();
	 String updatedFileName = seeHere.replace(':', '-');
	 System.out.println(updatedFileName);
	 
}
}
