import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

public class Stapel {

    Stack<Point> stapel = new Stack<>();

    Scanner kbdInput = new Scanner(System.in);
    public static void main(String[] args) {
        Stapel stapelManager = new Stapel();
        stapelManager.run();
    }

    private void run() {
        System.out.print("(p) für Punkt eingeben, (o) für Ausgabe: ");
        String art = kbdInput.next();
        while (!(art.equals("p") || art.equals("o"))) {
            System.out.println("Key "+art+" not allowed!");
            System.out.print("(p) für Punkt eingeben, (o) für Ausgabe: ");
            art = kbdInput.next();
        }
        switch(art) {
            case "o":
                System.out.println("> Ausgabe:");
                while( !stapel.isEmpty() ) {
                    stapel.peek().print();
                    stapel.pop();
                }
                return;

            case "p":
                System.out.println("> Punkt hinzufügen");
                System.out.println(" ");
                Point a = readPoint();
                stapel.push(a);
                run();
        }
    }

    private Point readPoint() {
        System.out.println("Input point");
        return new Point(getCoordinate("X"), getCoordinate("Y"), getCoordinate("Z"));
    }

    private double getCoordinate(String coorName) {
        System.out.print("Bitte "+coorName+"-Wert eingeben: ");
        return kbdInput.nextDouble();
    }
}
