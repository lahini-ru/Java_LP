package com.client;

import com.sun.net.ssl.internal.ssl.Provider;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.Security;

public class Chat_Client {

    public static void main(String[] args) throws IOException {

        int serverPort = 35786;
        String serverName = "localhost";
        Security.addProvider(new Provider());
        System.setProperty("javax.net.ssl.trustStore","myTrustStore.jts");
        System.setProperty("javax.net.ssl.trustStorePassword","1234567");
        System.setProperty("javax.net.debug","all");
        try
        {
            SSLSocketFactory sslsocketfactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
            SSLSocket sslSocket = (SSLSocket)sslsocketfactory.createSocket(serverName,serverPort);
            DataOutputStream outputStream = new DataOutputStream(sslSocket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(sslSocket.getInputStream());
            System.out.println(inputStream.readUTF());
            while (true)
            {
                System.out.println("Write a Message : ");
                String messageToSend = System.console().readLine();
                outputStream.writeUTF(messageToSend);
                System.err.println(inputStream.readUTF());
                if(messageToSend.equals("close"))
                {
                    break;
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
