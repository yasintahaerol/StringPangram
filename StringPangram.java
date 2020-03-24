package csd;

public class StringPangram {

	public static void main(String[] args) {
		PangramTestApp.run();

	}

}
class PangramTestApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		for( ; ; )
		{
			System.out.println("Enter a sencente: ");
			String s = kb.nextLine();
			System.out.println(StringUtil.isPangramTR(s) ? "Pangram for TR" : "Not Pangram for TR");
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram for EN" : "Not Pangram for EN");
			if(s.equalsIgnoreCase("quit"))
				break;
		}
	}
}
class StringUtil {
	public static boolean isPangram(String s, String alphabet) {
		s = s.toLowerCase();
		int len = alphabet.length();
		for(int i = 0; i < len; i++)
		{
			char ch = alphabet.charAt(i);
			if(!s.contains(ch +""))
				return false;
		}
		return true;
	}
	public static boolean isPangramTR(String s)
	{
		return isPangram(s, "abcçdefgðhýijklmnoöprsþtuüvyz");
	}
	public static boolean isPangramEN(String s)
	{
		return isPangram(s, "abcdefghijklmnopqrstuwxvyz");
	}
}