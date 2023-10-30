package com.tino.ejercicios.encriptacion;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

/**
 * Encriptación y desencriptación de una cadena utilizando RSA
 */
public class Ejercicio02 {
    public static void main(String[] args) throws Exception {
        String texto = "Hola mundo";
        System.out.println("Texto original: " + texto);

        // genera par de claves RSA (publica y privada)
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic(); // clave publica
        PrivateKey privateKey = keyPair.getPrivate(); // clave privada

        // encripta texto
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey); // modo de encriptacion con la clave publica
        byte[] bytesEncriptados = cipher.doFinal(texto.getBytes());

        // convierte texto encriptado a Base64
        String textoEncriptado = Base64.getEncoder().encodeToString(bytesEncriptados);
        System.out.println("Texto encriptado: " + textoEncriptado);

        // desencriptar
        cipher.init(Cipher.DECRYPT_MODE, privateKey); // modo de desencriptacion con la clave privada
        byte[] bytesDesencriptados = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
        String textoDesencriptado = new String(bytesDesencriptados);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }
}
