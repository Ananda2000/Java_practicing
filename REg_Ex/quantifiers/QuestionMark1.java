// PRACTICING THE USE OF "?" IN REGEX....

package quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMark1 
{

	public static void main(String [] args)
	{
		System.out.println("The use of ? in regex....");
		
		String Regex ="a{1}";
		String str ="ggg";
		
		Pattern ptr = Pattern.compile(Regex);
		Matcher mtr = ptr.matcher(str);
		
		System.out.println(mtr.find());
		
		System.out.println(Pattern.matches("a?", "annd")); //false x should occur once or not at all.
		System.out.println(Pattern.matches("a+", "aaa")); // True - x occurs zero or more times...
		System.out.println(Pattern.matches("[amn]+", "aaammmmnnn"));// True - x occurs zero or more times.
		System.out.println(Pattern.matches("[amn]?", "amn"));
		
		
		
	}
}
