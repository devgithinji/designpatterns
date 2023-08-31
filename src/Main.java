import singleton.LazySingleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.getName("dennis"));
    }
}