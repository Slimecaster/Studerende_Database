import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DbSql db = new DbSql();

        Scanner input = new Scanner(System.in);
        System.out.println("1. Opret Studerende");
        System.out.println("2. Opret fag");
        System.out.println("3. Tilmeld studerende til fag");
        System.out.println("4. Frameld studerende til fag");
        System.out.println("5. Udskriv alle studerende");
        System.out.println("6. Udskriv alle fag");
        System.out.println("7. Søg oplysninger om en studerende");
        System.out.println("8. Søg oplysninger om et fag");
        System.out.println("Indtast dit valg: ");
        int valg = input.nextInt();
        switch (valg) {
            case 1:
                Studerende s = new Studerende(15, "Mikkel", "Jensen", "Holbækvej 13", "2200", "11 22 33 55", 'a');
                db.opretStuderende(s);
                break;
            case 2:
                Fag f1= new Fag(2,"Java");
                db.opretFag(f1);
                break;
            case 3:
                db.tilmeldStudereneTilFag(1,2,12);
                break;
            case 4:
                break;
            case 5:
                db.alleStuderende();
                break;
            case 6:
                db.alleFag();
                break;
        }
    }
}