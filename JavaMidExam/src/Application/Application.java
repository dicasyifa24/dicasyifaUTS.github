/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import data.*;
import java.util.Scanner;
/**
 *
 * @author Dica
 */
public class Application {
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;
        
        Scanner input = new Scanner(System.in);
        
        Asus ass = new Asus();
        Acer acr = new Acer();
        
        /* Untuk test Asus */
        ass.hpSlogan();
        System.out.print("Nama             : "); Nama = input.nextLine();
        System.out.print("Prosesor         : "); Prosesor = input.nextLine();
        System.out.print("Jumlah Core      : "); Core = input.nextInt();input.nextLine();
        System.out.print("Operating System : "); Os = input.nextLine();
        System.out.print("Ukuran RAM(GB)   : "); Ram = input.nextInt();input.nextLine();
        System.out.print("Jenis Storage    : "); Storage = input.nextLine();
        System.out.print("Stok             : "); Stok = input.nextInt();input.nextLine();
        System.out.println("");
        ass.setNama(Nama);
        ass.setProsesor(Prosesor);
        ass.setCore(Core);
        ass.setOs(Os);
        ass.setRam(Ram);
        ass.setStorage(Storage);
        ass.setStok(Stok);
        ass.getAllLaptopData();
        System.out.println("Store Position " + ass.getNama() + 
                " adalah " + ass.getStorePositionLaptop());
        System.out.println("==========================================");
                
        // ============================================================== //
        
        /* Untuk test Acer */
        acr.acerSlogan();
        System.out.print("Nama             : "); Nama = input.nextLine();
        System.out.print("Prosesor         : "); Prosesor = input.nextLine();
        System.out.print("Jumlah Core      : "); Core = input.nextInt();input.nextLine();
        System.out.print("Operating System : "); Os = input.nextLine();
        System.out.print("Ukuran RAM(GB)   : "); Ram = input.nextInt();input.nextLine();
        System.out.print("Jenis Storage    : "); Storage = input.nextLine();
        System.out.print("Stok             : "); Stok = input.nextInt();input.nextLine();
        System.out.println("");
        acr.setNama(Nama);
        acr.setProsesor(Prosesor);
        acr.setCore(Core);
        acr.setOs(Os);
        acr.setRam(Ram);
        acr.setStorage(Storage);
        acr.setStok(Stok);
        acr.getAllLaptopData();
        System.out.println("Store Position " + acr.getNama() + 
                " adalah " + acr.getStorePositionLaptop());
        System.out.println("==========================================");       
    }
}

