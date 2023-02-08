package java_17;

public class StringConcat {

    public static void main(String arg[]) {
        System.out.println("hello world!");
        // hello world

        String output = "say ".concat(getMessage()); 

        System.out.println(output);
        // say hello world

        System.out.println(sayHello("Joe"));
        // hello Joe

        System.out.println(sayHowMany(3));
        // hello it can be 3 dogs
    }


    public static String getMessage() {
        return "hello world!";
    }

    public static String sayHello(String name) {
        return "hello ".concat(name);
    }

    public static String sayHowMany(int i) {
        return "hello it can be "
        .concat(String.valueOf(i))
        .concat(" dogs");
    }

}