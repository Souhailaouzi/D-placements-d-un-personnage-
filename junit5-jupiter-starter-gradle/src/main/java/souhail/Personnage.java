package souhail;
public class Personnage{
    public static String tourner(String orientationInitiale, int fois) {
        String[] directions = {"NORD", "EST", "SUD", "OUEST"};
        int index = java.util.Arrays.asList(directions).indexOf(orientationInitiale);
    
        if (index == -1) {
            throw new IllegalArgumentException("Orientation inconnue : " + orientationInitiale);
        }
    
        int newIndex = (index + fois % 4 + 4) % 4;
        return directions[newIndex];
    }
    
    
    
    
    
}    
    



































/*package souhail;

public class Personnage {

    public static String tourner(String orientationInitiale, int fois) {
        String[] tab = {"NORD", "EST", "SUD", "OUEST"};

        int pos = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].equals(orientationInitiale)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("erreur a zbbi");
        }
        int newindice = (pos+ fois % 4 + 4) % 4;
        return tab[newindice];
    }
}
*/
