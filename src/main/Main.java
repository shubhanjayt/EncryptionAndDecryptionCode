package main;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.Signature;

public class Main {
    public static class CipherDecrypt {
        public static void main(String args[]) throws Exception {
            Signature sign = Signature.getInstance("SHA256withRSA");
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(2048);
            KeyPair pair = keyPairGen.generateKeyPair();
            PublicKey publicKey = pair.getPublic();


        }
    }

}
