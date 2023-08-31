import singleton.SerializableSingleton;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(lazySingleton.getName("dennis"));
        exampleSerialization();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
//        objectOutputStream.writeObject(lazySingleton);
//        objectOutputStream.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
//        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println("Object 1 :" + lazySingleton.hashCode());
//        System.out.println("Object 2 :" + deserializedLazy.hashCode());


        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("SerilaizableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println("SerilaizableSingleton Object 2 :" + deserializedInstance.hashCode());
    }
}