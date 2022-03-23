/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Messenger;

/**
 *
 * @author Dica
 */
public class Sender {
    public static void main(String[]args){
    
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "Test", "Halo!");
        std.sendMessage("Aca", "Hai", "Haiii acaaa ?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Rahasia", "Jangan Beritahu siapapun!");
        mail.sendMessage("Dica", "Haii", "Dica Main yu");
        mail.disconnect();
        mail.sendMessage("Dias", "Apa kabar", "Dias bagaimana kabar nya ?");
    }
}