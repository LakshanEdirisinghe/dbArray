package pack;

import java.util.*;

public class DbArray {

    private String name;
    private int age;
    private int top;

    private DbArray dtArray[];

    private DbArray(String num, int old) {
        this.name = num;
        this.age = old;

    }

    public DbArray() {
        this.dtArray = new DbArray[1];
        this.top = 0;

    }

    public void pushData(String pName, int pAge) {

        if (top >= dtArray.length) {

            DbArray[] temp = new DbArray[dtArray.length + 1];

            for (int i = 0; i < dtArray.length; i++) {
                temp[i] = dtArray[i];
            }
            dtArray = temp;
        }

        this.dtArray[top++] = new DbArray(pName, pAge);
    }

    public void printStack() {
        System.out.println("----- Stack Contents -----");
        if (top == 0) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.println("Name: " + dtArray[i].name + "\n Age: " + dtArray[i].age);
            }
        }
        System.out.println("--------------------------");
    }

}
