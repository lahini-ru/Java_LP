package com.server;


import com.sun.net.ssl.internal.ssl.Provider;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.*;

public class Chat_Server {

    public static void main(String[] args) {

        int port=35786;
        Security.addProvider(new Provider());
        System.setProperty("javax.net.ssl.keyStore","myKeyStore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","1234567");
        System.setProperty("javax.net.debug","all");

        try
        {
            SSLServerSocketFactory sslServerSocketfactory = (SSLServerSocketFactory)SSLServerSocketFactory.getDefault();
            SSLServerSocket sslServerSocket = (SSLServerSocket)sslServerSocketfactory.createServerSocket(port);
            System.out.println("Server Started & Ready to accept Client Connection");
            SSLSocket sslSocket = (SSLSocket)sslServerSocket.accept();
            DataInputStream inputStream = new DataInputStream(sslSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(sslSocket.getOutputStream());
            outputStream.writeUTF("Hello Client..!");
            while(true)
            {
                String receivedMessage = inputStream.readUTF();
                System.out.println("Client Said : " + receivedMessage);
                if(receivedMessage.equals("close"))
                {
                    outputStream.writeUTF("Bye");
                    outputStream.close();
                    inputStream.close();
                    sslSocket.close();
                    sslServerSocket.close();
                    break;
                }
                else
                {
                    outputStream.writeUTF("You Said : "+receivedMessage);
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
