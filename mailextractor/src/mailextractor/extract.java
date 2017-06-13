package mailextractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extract {

	public void reg (){
String s = "paste emails here";
String regex="\\<(.*?)\\>";
		Pattern p = Pattern.compile(regex);   // the pattern to search for
	    Matcher m = p.matcher(s);
	   for(int i=0; i<1000; i++){
	    if (m.find())
	    {
	      // we're only looking for one group, so get it
	      String theGroup = m.group(1);
	      
	      // print the group out for verification
	      System.out.format("%s\n", theGroup);
	    }
	   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extract m = new extract();
		m.reg();
	
		
	}}


