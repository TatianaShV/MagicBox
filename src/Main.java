public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> box1 = new MagicBox<>(5);
        MagicBox<String> box2 = new MagicBox<>(3);
        System.out.println(box1.add(956));
        System.out.println(box1.add(5));
        System.out.println(box1.add(66));

        box2.add("hat");
        box2.add("ring");
        box2.add("ball");
        System.out.println(box2.pick());
        System.out.println(box1.pick());
    }
}