package souhail;
public class Personnage{
    public static String tourner(String orientationInitiale, int fois) {
        switch (orientationInitiale) {
            case "EST":
                return "SUD";
            default:
                throw new IllegalArgumentException("Orientation inconnue : " + orientationInitiale);
        }
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
