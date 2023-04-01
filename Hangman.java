import java.util.ArrayList;
public class Hangman
{
	ArrayList<String> ar = new ArrayList<String>();
	String [] word = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	public void addWord(String z)
	{
		ar.add(z);  
	}
	public String getName(int a)
	{
		String b = ar.get(a);
		return b;
	}
	public boolean checkWord(String a)
	{
		for(int i = 0 ; i<26 ; i++)
		{
			if(word[i].equals(a))
			{
				return true;
			}
		}
				return false;
	}
  
}