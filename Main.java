public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); <-- error
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Owl hedwig = new Owl();
        Pig burin = new Pig();
//        wagyu.sound();
//        donald.sound();
//        hedwig.sound();
//        burin.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        Duck fourseasons = new PekingDuck("4ss");
        fourseasons.clean(daisy);
        fourseasons.fly();

        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
    }
}