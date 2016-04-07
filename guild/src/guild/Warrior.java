package guild;

public class Warrior 
{
 int hp;
 String name;
 int level;
 int exp;
 static int count;
public Warrior ()
{
	this.hp = 30;
	this.count++;
	this.name = "Warrior #"+count; 
}
}
