package treiber;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Treiber {

  public static void main(String[] args) {
    //bitte in Scanner mit kommata eingeben, z.b(25,6) oder (6,5)
    Scanner scan = new Scanner(System.in);
    System.out.println("Gib dein Einkaufspreis pro Aktie an:");

    double einkaufspreis = scan.nextDouble();
    int tag = 1;
    double kurs= 0.1;
    DecimalFormat df = new DecimalFormat("0.00");

    while(true){
      System.out.println("Gib den aktuellen Kurs für den Tag " + tag + " an" + " oder -1 zum " +
          " Beenden: ");
      kurs = scan.nextDouble();
      if(kurs < 0.0) break;
      double gewinn = kurs - einkaufspreis;
      if(kurs > einkaufspreis){
        System.out.println("nach dem Tag " + tag + " hast du einen Gewinn in höhe von " + df.format(gewinn) +
            " pro Aktie gemacht.");
      } else if (gewinn < 0.0) {
        System.out.println("nach dem Tag " + tag + " hast du einen Verlust in Höhe von " + df.format(-gewinn) +
            " pro Aktie gemacht.");
      }
      else {
        System.out.println("nach dem Tag " + tag + " hast du keinen Gewinn gemacht");
      }
      tag++;
    }
    scan.close();
  }

}
