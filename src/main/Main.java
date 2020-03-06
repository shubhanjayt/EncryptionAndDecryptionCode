package main;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Scanner;

public class Main {
    public static class CipherDecrypt {
        public static void main(String args[]) throws Exception {
            Signature sign = Signature.getInstance("SHA256withRSA");
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(2048);
            KeyPair pair = keyPairGen.generateKeyPair();
            PublicKey publicKey = pair.getPublic();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter a String ");
            String p = obj.nextLine();
            byte[] input = p.getBytes();
            cipher.update(input);
            byte[] cipherText = cipher.doFinal();


        }
    }

}
