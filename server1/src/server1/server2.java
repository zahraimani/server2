/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */


public class server2 implements Runnable{
private Thread mainThread;
private int port;
private ServerSocket socketServer;





    @Override
    public void run() {
    try {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        socketServer =new ServerSocket(port);

        
       while(true){
          
            Socket cli = socketServer.accept();
            HandleSocket handle = new HandleSocket();
            handle.setSocket(cli);
            handle.start();

       }
        
    } catch (IOException ex) {
        Logger.getLogger(server2.class.getName()).log(Level.SEVERE, null, ex);    
        }
        
        
    }
    public void setPort(int p){
    port = p;
    }
    
    
    
    public void start(){
    mainThread = new Thread(this);
    mainThread.start();  
}
    
}
