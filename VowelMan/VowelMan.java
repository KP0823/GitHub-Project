public class VowelMan
{
	public static int vowelcount(String s)
	{
		int counter = 0;
		for(int i = 0; i < s.length(); i++)
		{
				String myline = "" + s.charAt(i);
				if(myline.equals("A") || myline.equals("E") || myline.equals("I") || myline.equals("O") || myline.equals("U") ||myline.equals("a") || myline.equals("e") || myline.equals("i") || myline.equals("o") || myline.equals("u"))
						{
							counter++;
						}
				if(i - 1 >= 0 && (s.substring(i- 1) !=" " && myline.equals("y")))
						counter++;
		}
		return counter;
	}
	public static void main (String[] args)
	{
		String t = "I bey";
		System.out.println(vowelcount(t));
	}
}
	