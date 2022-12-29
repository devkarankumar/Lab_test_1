package myproject1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Email
{
	public static boolean isValid(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@" +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> address = new ArrayList<>();
			
		address.add("review-thedevkaran@gmail.com");
		address.add("writing.thedevkaran");
			
		for(String i : address){
			if (isValid(i))
				System.out.println(i + " - Yes");
			else
				System.out.println(i + " - No");
		}
	}
}
