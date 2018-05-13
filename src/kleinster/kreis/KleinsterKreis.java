package kleinster.kreis;

public class KleinsterKreis {

    public static void main(String[] args) {
        int anzahlP = 10;
        Tuple[] points = new Tuple[anzahlP];

        for (int i = 0; i < anzahlP; i++) {
            points[i] = new Tuple((int) (Math.random() * 100), (int) (Math.random() * 100));
            System.out.println(points[i].x + "," + points[i].y);
        }
        int greatestX = 0;
        int smallestX = 100;
        int greatestY= 0;
        int smallestY=100;
                
        for (int i = 0; i < anzahlP; i++) {

            if (points[i].x < smallestX) {
                smallestX = points[i].x;
            }

        }
        
        for (int i = 0; i < anzahlP; i++) {

            if (points[i].x > greatestX) {
                greatestX = points[i].x;
            }

        }
 
        
        for (int i = 0; i < anzahlP; i++) {

            if (points[i].y < smallestY) {
                smallestY = points[i].y;
            }

        }
 
        for (int i = 0; i < anzahlP; i++) {

            if (points[i].y > greatestY) {
                greatestY= points[i].y;
            }

        }
        System.out.println("\n"+smallestX+","+smallestY+"\n"+greatestX+","+greatestY);
    
    }

}
