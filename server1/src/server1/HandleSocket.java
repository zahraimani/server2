/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class HandleSocket implements Runnable{

    private Thread t1;
    private InputStream in;
    private OutputStream out;
    private Socket handleSocket;
    //private int p;
    
    

    @Override
    public void run() {
         byte[] by = new byte[1024];
            String st = new String();
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //handleSocket new Socket(p);
         in= handleSocket.getInputStream();
         out= handleSocket.getOutputStream();
         while(true){
             System.out.println("start ... ");
         in.read(by);
             System.out.println("reading...");
         String string = new String(by);
             System.out.println(string);
         out.write(by);
         String string1 = new String(by);
             System.out.println(by);
         
      
         }
           
           
           
        } catch (IOException ex) {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    public void setSocket(Socket so){
   this.handleSocket = so;
    
    }
 
 public void start(){
 t1 = new Thread(this);
 t1.start();
 
 }
}
