package options;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.main.log.Level;

public class CustomFormatter {
	
	 String date = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).format(new Date());
	 Calendar cal = Calendar.getInstance();
	 int hours = cal.get(Calendar.HOUR_OF_DAY);
	 int minutes = cal.get(Calendar.MINUTE);
	 String hour = hours+":"+minutes;
	 
	 public CustomFormatter(String msg) {
		 StringBuilder buf = new StringBuilder();
		 
		 //if (Level.ERROR == log.getLevel()) {
			 buf.append( "<td style='color:red'>");
			 //buf.append(log.getLevel());
		 //}
		 }
	 
	 public String getDateHour(){
		return date+" "+hour;
	 }
}
