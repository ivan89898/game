import java.util.ArrayList;
import java.util.List;

public class Game {
    protected List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String name1, String name2) {
        Player p1 = null;
        Player p2 = null;
        for (Player player : players) {
            if (player.getName().equals(name1)) {
                p1 = player;
            }
            if (player.getName().equals(name2)) {
                p2 = player;
            }
        }
        if (p1 == null) {
            throw new RuntimeException("Игрок 1 не зарегистрирован");
        }
        if (p2 == null) {
            throw new RuntimeException("Игрок 2 не зарегистрирован");
        }
        if (p1.getStrength() == p2.getStrength()) {
            return 0;
        }
        if (p1.getStrength() > p2.getStrength()) {
            return 1;
        } else {
            return 2;
        }
    }
}
