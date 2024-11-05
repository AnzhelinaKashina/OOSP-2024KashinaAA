package _3;

public class Main {
    public static void main(String[] args) {
        EncryptionAlgorithm aes = new AesEncryption();
        EncryptionAlgorithm rsa = new RsaEncryption();
        EncryptionAlgorithm sha = new ShaEncryption();

        Encryption symmetricEncryption = new SymmetricEncryption(aes);
        Encryption asymmetricEncryption = new AsymmetricEncryption(rsa);

        String data = "Конфиденциальные данные";

        System.out.println(symmetricEncryption.encrypt(data));
        System.out.println(asymmetricEncryption.encrypt(data));
        System.out.println(sha.encrypt(data));

        System.out.println(symmetricEncryption.decrypt(symmetricEncryption.encrypt(data)));
        System.out.println(asymmetricEncryption.decrypt(asymmetricEncryption.encrypt(data)));


    }
}
