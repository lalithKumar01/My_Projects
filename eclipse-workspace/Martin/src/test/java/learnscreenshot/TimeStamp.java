package learnscreenshot;

import java.time.LocalDateTime;

public class TimeStamp {
public static void main(String[] args) {
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.out.println(timeStamp);
	
	
}
}
