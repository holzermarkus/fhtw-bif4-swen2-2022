package at.fhtw.swen2.layers.ui;

import at.fhtw.swen2.layers.business.PassagierService;
import at.fhtw.swen2.layers.business.PassagierServiceImpl;
import at.fhtw.swen2.layers.model.Passagier;

import java.util.Scanner;

public class PassagierUI {

    private PassagierService passagierService;



    public void startDemo() {
        Passagier passagier = readPassagierFromConsole();
        passagierService.savePassagier(passagier);

    }

    private Passagier readPassagierFromConsole() {
        Passagier passagier = new Passagier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("neuer Passagier");
        System.out.println("Vorname:");
        passagier.setVorname(scanner.nextLine());
        System.out.println("Nachname:");
        passagier.setNachname(scanner.nextLine());
        return passagier;
    }


    {
        passagierService = new PassagierServiceImpl();
    }
}
