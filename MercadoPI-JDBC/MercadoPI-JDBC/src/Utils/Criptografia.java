package Utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

    public static String criptografar(String senha) throws NoSuchAlgorithmException {
        try {
            String retorno = "";
            MessageDigest md;
            
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            retorno = hash.toString(16);
            
            return retorno;
        } catch (NoSuchAlgorithmException ex) {
            throw ex;
        }

    }
}
