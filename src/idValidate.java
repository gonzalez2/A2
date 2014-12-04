import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class idValidate {

	private Pattern pattern;
	private Matcher matcher;

	//Only the selected characters are allowed the ID
	private static final String USERNAME_PATTERN = "^[A-Za-z0-9_-]{3,15}$";

	public idValidate(){
		pattern = Pattern.compile(USERNAME_PATTERN); 
	}

	public boolean validate(final String username){
		matcher = pattern.matcher(username);
		return matcher.matches();
	}
}