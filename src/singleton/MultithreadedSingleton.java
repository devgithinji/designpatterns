package singleton;

public class MultithreadedSingleton {
    private static MultithreadedSingleton instance = null;

    private MultithreadedSingleton() {
    }

    public MultithreadedSingleton getInstance(){
        if (instance == null) {
            synchronized (MultithreadedSingleton.class) {
                if (instance == null) {
                    instance = new MultithreadedSingleton();
                }
            }
        }
        return instance;
    }
}
