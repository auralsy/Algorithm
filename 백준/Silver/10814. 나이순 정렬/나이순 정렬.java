import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Person> list= new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            int age = sc.nextInt();
            String name = sc.next();

            list.add(new Person(age, name));
        }

        Collections.sort(list, (k1, k2) -> {
            return k1.age - k2.age;
        });

        StringBuilder sb = new StringBuilder();
        for(Person p : list)
        {
            sb.append(p.age).append(" ").append(p.name).append('\n');
        }

        System.out.println(sb);
    }

    public static class Person{
        int age;
        String name;

        public Person(int age, String name)
        {
            this.age = age;
            this.name = name;
        }
    }
}