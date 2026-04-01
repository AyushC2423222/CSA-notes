
public class PrisonerClientDriver {
	public static void main(String args[])
	{
		Prisoner you = new Prisonerk1630454(); 
		Prisoner opponent = new Prisoner("Robot");		
		System.out.println(you.getName());
		System.out.println(you.getYears());
		PrisonerMatch vs = new PrisonerMatch(you, opponent);
		for(int i=0; i<10; i++)
		{
			vs.makesChoice();
			System.out.println(vs);
		}
		
		System.out.println(you.getYears());
	}
}
