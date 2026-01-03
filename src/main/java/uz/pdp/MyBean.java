package uz.pdp; /// maxsus class

public class MyBean {
    public void hi() {
        System.out.println("=== Hello from MyBean! ===");
    }

    private void init() {
        System.out.println("MyBean is......... initialized!");
    }

    private void destroy() {
        System.out.println("MyBean is......... destroyed!");
    }
}
