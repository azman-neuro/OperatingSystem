/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/
        Network objNetwork = new Network("network");
        Server objServer = new Server();
        Client objClient1 = new Client("sending");
        Client objClient2 = new Client("receiving");

        Thread clientSendingThread = new Thread(objClient1);
        Thread clientReceivingThread = new Thread(objClient2);
        Thread networkThread = new Thread(objNetwork);
        Thread serverThread = new Thread(objServer);

        networkThread.start();      /* Activate the network */
        serverThread.start();       /* Start the server */
        clientSendingThread.start();        /* Start the sending client */
        clientReceivingThread.start();      /* Start the receiving client */
    }
}
