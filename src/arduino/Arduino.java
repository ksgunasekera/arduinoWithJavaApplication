/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduino;
import com.fazecast.jSerialComm.*;
import java.util.Scanner;
/**
 *
 * @author Gunasekera
 */
public class Arduino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SerialPort ports[]=SerialPort.getCommPorts();
        System.out.println(ports[0]);
        for(SerialPort port:ports){
            System.out.println(port.getDescriptivePortName());
        }
        Scanner s=new Scanner(System.in);
        int choosePort=s.nextInt();
        SerialPort portC=ports[choosePort-1];
        System.out.println("You select "+portC.getDescriptivePortName());
        if(portC.openPort()){
            System.out.println("You opend port "+portC.getDescriptivePortName()+" successfully");
        }else{
            System.out.println("Failed to open the port");
        }
    }
    
}
