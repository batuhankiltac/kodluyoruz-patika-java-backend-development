import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Team> tempTeams = new ArrayList<>();
        ArrayList<Week> weeks = new ArrayList<>();

        Team homeTeam;
        Team awayTeam;

        teams.add(new Team("Real Madrid"));
        teams.add(new Team("FC Barcelona"));
        teams.add(new Team("Atlético de Madrid"));
        teams.add(new Team("Sevilla"));
        teams.add(new Team("Real Sociedad"));
        teams.add(new Team("Villarreal"));


        if (teams.size() % 2 ==1 ) {
            teams.add(new Team("BAY"));
        }

        int numberOfGames = teams.size() - 1;
        int week = 1;

        while (numberOfGames > 0) {
            tempTeams.addAll(teams);
            Week wk = new Week(week);
            while (tempTeams.size() > 0) {
                int random = rand.nextInt(tempTeams.size());
                homeTeam = tempTeams.get(random);
                tempTeams.remove(homeTeam);
                random = rand.nextInt(tempTeams.size());
                awayTeam = tempTeams.get(random);
                if (!homeTeam.opponent.contains(awayTeam.name)) {
                    homeTeam.opponent.add(awayTeam.name);
                    tempTeams.remove(awayTeam);
                    wk.homeTeam.add(homeTeam.name);
                    wk.awayTeam.add(awayTeam.name);
                }
                else {
                    wk = new Week(week);
                    tempTeams.clear();
                    tempTeams.addAll(teams);
                }
            }
            numberOfGames--;
            week++;
            weeks.add(wk);
        }

        for(Week w : weeks){
            System.out.println("(First Half of the Season) WEEK: " + w.number);
            for (int i = 0; i < w.awayTeam.size(); i++) {
                System.out.println(w.homeTeam.get(i) + " vs " + w.awayTeam.get(i));
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------\n");

        for(Week w : weeks){
            System.out.println("(Second Half of the Season) WEEK: " + (w.number + numberOfGames));
            for (int i = 0; i < w.awayTeam.size(); i++) {
                System.out.println(w.awayTeam.get(i) + " vs " + w.homeTeam.get(i));
            }
            System.out.println();
        }
    }
}