package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        // seuraavassa osoitteessa 27.11.2019 päivitetyt tilastot
        String url = "https://nhl27112019.herokuapp.com/players.txt";
        // ajan tasalla olevat tilastot osoitteessa
        // "https://nhlstatisticsforohtu.herokuapp.com/players.txt"

        Statistics stats = new Statistics(new PlayerReaderImpl(url));

        Matcher m = new And(
                new HasAtLeast(20, "points"),
                new Or(
                        new PlaysIn("NYR"),
                        new PlaysIn("NYI"),
                        new PlaysIn("NJD")
                )
        );

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }
}
