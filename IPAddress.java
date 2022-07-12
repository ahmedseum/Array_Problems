package Array;

import java.net.*;
class IPAddress {
    public static void main(String args[]) throws UnknownHostException {
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println("\nIP address of the machine: " + ipAddr.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}