public class EShopPlatform {
    private static EShopPlatform instance;

    private EShopPlatform() {
        // private constructor to prevent instantiation
    }

    public static EShopPlatform getInstance() {
        if (instance == null) {
            instance = new EShopPlatform();
            // Other initialization code here
        }
        return instance;
    }
}
