package _3;

public class AesEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        return "Зашифрованные данные AES: " + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        return "Расшифрованные данные: " + encryptedData;
    }
}

class RsaEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        return "Зашифрованные данные RSA: " + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        return "Расшифрованные данные: " + encryptedData;
    }
}

class ShaEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        return "SHA хэшированные данные: " + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        throw new UnsupportedOperationException("SHA не поддерживает расшифровку");
    }
}
