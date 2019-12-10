import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Print the top ten players based on goals
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //Print the top 25 players based on penalty amounts
        System.out.println("\nTop 25 by penaltys");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //Print the statistics for Sidney Crosby
        System.out.println("\nStats of Sidney C.");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //Print the statistics for Philadelphia Flyers (abbreviation: PHI)
        System.out.println("\nStats of PHI");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        //Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        System.out.println("\nAnaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        }
}
