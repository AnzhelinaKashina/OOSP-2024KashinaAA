package _3;

public class SymmetricEncryption extends Encryption {
    public SymmetricEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public String encrypt(String data) {
        return algorithm.encrypt(data);
    }

    @Override
    public String decrypt(String encryptedData) {
        return algorithm.decrypt(encryptedData);
    }
}

class AsymmetricEncryption extends Encryption {
    public AsymmetricEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public String encrypt(String data) {
        return algorithm.encrypt(data);
    }

    @Override
    public String decrypt(String encryptedData) {
        return algorithm.decrypt(encryptedData);
    }
}
