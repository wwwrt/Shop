public final class EShopPlatform {

    private EShopPlatform() {
    }

    public static EShopPlatform getInstance() {
        return EShopPlatformHolder.INSTANCE;
    }

    private static class EShopPlatformHolder {
        private static final EShopPlatform INSTANCE = new EShopPlatform();
    }
}


// am folosit Singleton pentru a ma asigura ca am o singura
// instanță a platformei eShop, și pentru a evita instanțele
// multiple care ar putea duce înspre incoerența datelor