public class Owl extends Animal implements Flyable{

    @Override
    void sound() {
        System.out.println("ฮูก ฮูก");
    }

    @Override
    public void fly() {
        System.out.println("hoot hoot");
    }

    @Override
    public void glide() {
        System.out.println("ฟิ้ว");
    }
}
