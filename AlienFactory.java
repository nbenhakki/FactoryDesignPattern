public class AlienFactory {
    enum Alien {
        MONKEY,
        RAT,
        SQUID,
        TIGER;
    }
    public static AlienClass getAlienClass (){
        int random = (int) (Math.random() * Alien.values().length);
        Alien alien = Alien.values()[random];
        switch (alien) {
            case MONKEY:
                return new MonkeyAlien();
            case RAT:
                return new RatAlien();
            case SQUID:
                return new SquidAlien();
            case TIGER:
                return new TigerAlien();
            default:
                return null;
        }
    }
}
