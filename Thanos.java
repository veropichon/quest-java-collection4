import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
;
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        Comparator<Hero> comparator = new Comparator<Hero> () {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        Map<Hero,Flower> treeParty= new TreeMap<>(comparator);
        treeParty.put(hulk, rose);
        treeParty.put(thor, rose);
        treeParty.put(scarletWitch, rose);
        treeParty.put(vision, tulip);
        treeParty.put(captainAmerica, lily);
        treeParty.put(doctorStrange, violet);
        treeParty.put(blackWidow, violet);


            // TODO 2 : Print if `begonia` is contained in the TreeMap
         System.out.println(treeParty.containsValue(begonia));

            // TODO 3 : For each hero, alphabetically, print the corresponding flower

        System.out.println("\nListe des Heros et leur fleur:\n");
        for (Hero hero : treeParty.keySet()) {
            Flower flower = treeParty.get(hero);
            System.out.println(hero.getName() + ": " + flower.getName());
        }

    }

}