package singleton;

//advantages
//Enums constructor gets invoked by the JVM not by the user who is using
//we don't need to worry about multithreading as enums are thread safe
//it solves the issue of serialization since JVM takes care of serialization
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Cool");
    }
}
