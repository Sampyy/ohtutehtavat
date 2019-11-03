/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sami
 */
public class StatisticsTest {
    
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));//16
            players.add(new Player("Lemieux", "PIT", 45, 54));//99
            players.add(new Player("Kurri",   "EDM", 37, 53));//90
            players.add(new Player("Yzerman", "DET", 42, 56));//98
            players.add(new Player("Gretzky", "EDM", 35, 89));//124
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }  
    
    @Test
    public void topScorersWorksWithWholeList()  {
        ArrayList<Player> playersComparing = new ArrayList<>();
        playersComparing.add(new Player("Gretzky", "EDM", 35, 89));
        playersComparing.add(new Player("Lemieux", "PIT", 45, 54));
        playersComparing.add(new Player("Yzerman", "DET", 42, 56));
        playersComparing.add(new Player("Kurri",   "EDM", 37, 53));
        playersComparing.add(new Player("Semenko", "EDM", 4, 12));
        for (int i = 0; i < 5; i++) {
                assertEquals(playersComparing.get(i).toString(), stats.topScorers(4).get(i).toString());
        }
    }
    
    @Test
    public void teamSearchWorks() {
        ArrayList<Player> playersComparing = new ArrayList<>();
        playersComparing.add(new Player("Semenko", "EDM", 4, 12));        
        playersComparing.add(new Player("Kurri",   "EDM", 37, 53));
        playersComparing.add(new Player("Gretzky", "EDM", 35, 89));
        
        for (int i = 0; i < 3; i++) {
            assertEquals(playersComparing.get(i).toString(), stats.team("EDM").get(i).toString());
        }
    }
    
    @Test
    public void playerSearchWorks() {
        assertEquals(new Player("Kurri",   "EDM", 37, 53).toString(), stats.search("Kurri").toString());
    }
    
    @Test
    public void playerSearchWorksWhenNotFound() {
        assertEquals(null, stats.search("kurri"));
    }
}
