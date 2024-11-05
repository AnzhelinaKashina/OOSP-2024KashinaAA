package _3;

public abstract class Encryption {
    protected EncryptionAlgorithm algorithm;

    public Encryption(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public abstract String encrypt(String data);
    public abstract String decrypt(String encryptedData);
}
