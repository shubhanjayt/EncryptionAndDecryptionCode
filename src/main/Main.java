package main;

import java.security.KeyPairGenerator;
import java.security.Signature;

public class Main {
    public static class CipherDecrypt {
        public static void main(String args[]) throws Exception {
            Signature sign = Signature.getInstance("SHA256withRSA");
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");


        }
    }

}
