import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game = new Game();
    Player p1 = new Player(1, "Sveta", 10);
    Player p2 = new Player(2, "Anya", 20);
    Player p3 = new Player(3, "Kolya", 30);
    Player p4 = new Player(4, "Gena", 40);
    Player p5 = new Player(5, "Anya", 50);

    @Test
    public void test() {
        assertThrows(RuntimeException.class, () -> {
            game.round("unknown1", "unknown2");
        });
    }

    @Test
    public void testSetStrength() {
        Game game = new Game();
        Player p = new Player(1, "Sveta", 45);
        p.setStrength(45);
        int expected = 45;
        int actual = p.getStrength();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetId() {
        Game game = new Game();
        Player p = new Player(68, "Sveta", 27);
        p.setId(45);
        int expected = 45;
        int actual = p.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Game game = new Game();
        Player p = new Player(68, "Sveta", 27);
        p.setName("Sasha");
        String expected = "Sasha";
        String actual = p.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoNameEquals() {
        Game game = new Game();
        Player p1 = new Player(68, "Sveta", 27);
        Player p2 = new Player(47, "Sveta", 78);
        assertThrows(RuntimeException.class, () -> {
            game.round("Sveta", "Sveta");
            int expected = 2;
            int actual = game.round("Sveta", "Sveta");
        });


    }

    @Test
    public void testTwoStrengthEquals() {
        Game game = new Game();
        Player p1 = new Player(68, "SvetaSveta", 78);
        Player p2 = new Player(47, "Sveta", 78);
        assertThrows(RuntimeException.class, () -> {
            game.round("SvetaSveta", "Sveta");
            int expected = 0;
            int actual = game.round("Sveta", "Sveta");
        });


    }
}
