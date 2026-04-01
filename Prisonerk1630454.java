import static java.lang.System.*;
import java.util.*;
//PEAK LORE BEFORE THE ACTUAL CODE
//AT 1 POINT I WATCHED AN ANIME CALLED KENGAN ASHURA 
//IT WAS GOOD ABOUT WRESTLING, I THINK YOU WILL LIKE IT
//BUT JUST LIKE ALL ANIME THERE IS SOMEONE WHO'S MAIN POWER IS ADAPTABILITY
//BUT IT IS THE VILLIAN, NOT REALLY THE HERO
//THIS MAN IS A BEAST, AND I MADE MY COED TO MATCH DA REAL RANDOMNESS OF HIS FIGHTING
//AND ALSO JUST FOR UN LOL :)
//FUN LABB
public class Prisonerk1630454 extends Prisoner {
    private boolean myLastChoice = false;
    private int oppDef = 0;
    private int oppCoop = 0;
    private int roundCounter = -1;
    //i can also make it -1 and add 1 at first. idk y im thinking that but im low on caffeine and my contacts hurt
    private int streak = 0;
    private String opponentType = "unknown";
    Prisonerk1630454(){
        super("k1630454");
    }
    @Override
    public void addYears(int x) {
        super.addYears(x);
        boolean oppDefected;
        if (myLastChoice) {
            oppDefected = (x == 2); 
        } else {
            oppDefected = (x == 3);
        }
        if (oppDefected) {
            oppDef++;
        } else {
            oppCoop++;
        }
        if (roundCounter == 1 && oppDef == 2) {
            opponentType = "defector";
        }
        if (roundCounter == 3) {
            if (oppDef >= 4) {
                opponentType = "defector";//PEAK IDENTIFYES
            } else if (oppDef <= 1) {
                opponentType = "cooperator";
            } else {
                opponentType = "random";
            }
        }
    }
    @Override
    public boolean getChoice() {
        roundCounter++; //y am i doing this. hooly tweek. starts at 0 now
        boolean decision;
        if (roundCounter == 0) {
            decision = false;
        } else if (roundCounter >= 8) {
            decision = true;
        } else if (roundCounter <= 3) {
            decision = oppDef > oppCoop ? true : false;//using turnary because i wanna pracice for d3 and also cuz im tweaking about long code
        } else if (opponentType.equals("cooperator")) {
            decision = false;
        } else if (opponentType.equals("defector")) {
            if (Math.random() < 0.10) {
                decision = false;
            } else {
                decision = true;
            }
            decision = applyStreak(decision);
        } else {
            decision = oppDef > oppCoop;
        }
        myLastChoice = decision;
        return decision;
    }
    private boolean applyStreak(boolean decision) {
        if (decision == myLastChoice) {
            streak++;
            if (streak >= 3) {
                decision = !decision;
                streak = 0;
            }
        } else {
            streak = 0;
        }
        return decision;
    }
    public static void main(String[] args) {
    }
}
