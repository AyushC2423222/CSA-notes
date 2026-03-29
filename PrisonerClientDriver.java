
public class PrisonerClientDriver {
	public static void main(String args[])
	{
		Prisoner you = new Prisonerk1630454(); //instantiate your classCHECK THIS
//		Prisoner dupe = new Prisonerk1630454(); //instantiate your classCHECK THIS
		Prisoner opponent = new Prisoner("Robot");
//		Prisoner grudger = new Grudger();
//		Prisoner hitandrun = new HitAndRun();
//		Prisoner chaos = new Chaos();
//		Prisoner tft = new TFT();
//		Prisoner ALLD = new ALLD();
//		Prisoner ALLC = new ALLC();
//		Prisoner pavlov = new Pavlov();
//		Prisoner lazy = new Prisoner();
//		Prisoner agitoKanoh = new Kanoh();
//		Prisoner sen = new Sen();
//		Prisoner agito = new Agito();
		
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
