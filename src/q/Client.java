package q;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AbdeAMNR
 */
public class Client {

    public Client() {
    }

    public static void main(String[] args) {
        try {
            intObjetDistant stub = (intObjetDistant) Naming.lookup("Hello");
            while (true) {
                ArrayList result = stub.invalidDocs();
                System.out.println("============================================\n");
            }
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            System.err.println("abde err Client exception: " + e.toString());
        }
    }
}
