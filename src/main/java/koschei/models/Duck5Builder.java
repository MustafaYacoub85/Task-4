package koschei.models;

public class Duck5Builder {
    private Egg6 egg;

    public Duck5Builder setEgg(Egg6 egg) {
        this.egg = egg;
        return this;
    }

    public Duck5 createDuck5() {
        return new Duck5(egg);
    }
}