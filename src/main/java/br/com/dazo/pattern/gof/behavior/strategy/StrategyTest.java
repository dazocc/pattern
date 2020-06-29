package br.com.dazo.pattern.gof.behavior.strategy;

/*
 * MementoTest. Allows one of a family of algorithms to be selected on-the-fly at run-time.
 * */
public class StrategyTest {


    public static void main(String[] args) {

        Encryption aesStrategy = new AesEncryption();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);
        aesEncryptor.encrypt("Text that will be encrypted");

        Encryption blowfishStrategy = new BlowfishEncryption();
        Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
        blowfishEncryptor.encrypt("Text that will be encrypted");
    }
}
