package guild;

public class Warrior 
{
 int hp;
 String name;
 int level;
 int exp;
 static int count;
 static boolean[] nameHolder = new boolean[4];
public Warrior ()
{
	this.hp = 30;
	//check if count if out of range.
	this.count++;
	this.name = generateName(); 
}
private String generateName(){
	for (int i = 0; i < nameHolder.length; i++)
	{
		if (nameHolder[i] == false)
		{
			nameHolder[i] = true;
			return "Warrior #"+ (i + 1);
		}
	}
	//Code should never reach here.
	//Explanation: if nameHolder is full then 'count' failed.   
	System.out.println("No vacant spot. Programming failure.");
	return "Idiot";
}
}
