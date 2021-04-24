package Test;

import java.util.Arrays;
import java.util.Collections;

public class finalTest {
    public static final User u=new User();

    public static void main(String[] args) {
//        o:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("i=" + i + ",j=" + j);
//                if (j == 5) {
//                    break o;
//                }
//
//            }
//        }
        char m='0';
//        char res=(char) m+1;
        System.out.println((char) (m+1));
    }

    Object obj =new Object();
}

class User {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}