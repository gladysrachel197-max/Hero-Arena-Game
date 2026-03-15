package characterarena;

import java.util.ArrayList;

public class GameManager {

    private ArrayList<Hero> heroes;

    public GameManager() {
        heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }
}
