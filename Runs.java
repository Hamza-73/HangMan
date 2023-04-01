import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Runs
{
	public static void main (String[] args)
	{
		int guess = 6;
		int warnings = 4;
		
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("a"); abc.add("b"); abc.add("c"); abc.add("d"); abc.add("e"); abc.add("f");
		abc.add("g"); abc.add("h"); abc.add("i"); abc.add("j"); abc.add("k"); abc.add("l");
		abc.add("m"); abc.add("n"); abc.add("o"); abc.add("p"); abc.add("q"); abc.add("r");
		abc.add("s"); abc.add("t"); abc.add("u"); abc.add("v"); abc.add("w"); abc.add("x");
		abc.add("y"); abc.add("z");
		
		ArrayList<String> cast = new ArrayList<String>();
		ArrayList<String> quest = new ArrayList<String>();
		
		cast.add("_");
		cast.add("_");
		cast.add("_");
		cast.add("_");
		
		Hangman word = new Hangman();
			word.addWord("b l u e");
			word.addWord("p o n y");
			word.addWord("c a r d");
			word.addWord("h a r d");
			
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int x = random.nextInt(5);
		String z = word.getName(x);
 
		String [] ald = z.split(" ");
		for( int i=0; i<4; i++)
		{
			quest.add(ald[i]);
		}
		
		System.out.println("Think of a 4 letter word.");
			
		for (int i = 0 ; i<10 ; i++)
		{
			System.out.println("You have " + guess + " guess");
			System.out.println("You have " + warnings + " warnings");
			System.out.println("Available Letters : " + abc );
			System.out.print("Enter a lettter : ");
			String str = sc.next();
			String ag = str;
						
		if(word.checkWord(str))
		{
		   guess--;
		   for(int m = 0; m<4; m++)
		   {
			   if(quest.get(m).equals(str))
			   {
				
					if(str.equals(cast.get(m)))
					{
						System.out.println("OPPS!!!!! You have Already Guessed this letter.");
						System.out.println("");
					}
				
				cast.remove( m );
				cast.add(m,str);
													
			   }
			}
		}
		else
		{
			System.out.println("Invalid entry - Enter a  Valid Letter only");
			warnings--;
		}
		abc.remove(ag);
				
		System.out.println("");
		
		for(String d : cast)
		{
			System.out.print(d);
		}
		
		System.out.println("");
	
		
		if(cast.equals(quest))
		{ 
			System.out.println("Hurray!!!!!! You have Won Game ");
			break;
		}
	   
		if( warnings==0)
		{
		   System.out.println(" Game Over!!!!! ");
		   System.out.println(" You've Ran Out of Warnings.");
		   System.out.println("Word to be guessed was : " + quest );
		   break;
		}
		if( guess==0 )
		{
		   System.out.println(" Game Over!!!!! ");
		   System.out.println(" You Ran Out of Guesses.");
		   System.out.println("Word to be guessed was : " + quest );
		   break;
		}
				
   }

 }
}