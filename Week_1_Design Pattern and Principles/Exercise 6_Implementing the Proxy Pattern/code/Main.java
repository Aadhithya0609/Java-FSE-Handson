public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("dog.jpg");
        Image img2 = new ProxyImage("cat.jpg");

        img1.display();
        System.out.println();
        img1.display();
        System.out.println();
        img2.display();
    }
}
