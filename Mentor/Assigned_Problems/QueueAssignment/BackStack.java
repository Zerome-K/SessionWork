package queueAssignment;

import java.util.Scanner;
import java.util.Stack;

public class BackStack {
    Scanner scanner = new Scanner(System.in);
    Stack<String> methods = new Stack<>();
    public void mainMenu() {
        System.out.println("""
                1 -> CAREER SELECTION
                2 -> EXIT
                """);
        byte option = getOption();
        if (option == 1) {
            methods.push("mainMenu");
            career();
        } else previous();
    }

    public void career() {
        System.out.println("""
                1 -> UG
                2 -> BACK
                """);
        byte option = getOption();
        if (option == 1) {
            methods.push("career");
            ug();
        } else previous();
    }

    private void ug() {
        System.out.println("""
                1 -> UG-ENGINEERING
                2 -> UG-ARTS
                3 -> BACK
                """);
        byte option = getOption();
        if (option == 1) {
            methods.push("ug");
            ugEngineering();
        } else if (option == 2) {
            methods.push("ug");
            ugArts();
        } else previous();
    }

    private void ugEngineering() {
        System.out.println("""
                *- Computer Science & Engineering
                *- Mechanical Engineering
                *- Civil Engineering
                *- Electrical & Electronics Engineering
                1 -> BACk
                """);
        byte option = getOption();
        if(option == 1)previous();
    }

    private void ugArts() {
        System.out.println("""
                *- BA.History
                *- BA-Tamil
                *- BA-English
                *- B.Commerce
                1 -> BACk
                """);
        byte option = getOption();
        if(option == 1)previous();
    }

    public byte getOption() {
        return scanner.nextByte();
    }

    public void previous() {
        if (!methods.isEmpty()) {
            String currentMethod = methods.pop();
            switch (currentMethod) {
                case "mainMenu" -> mainMenu();
                case "career" -> career();
                case "ug" -> ug();
                case "ugEngineering" -> ugEngineering();
                case "ugArts" -> ugArts();
                default -> System.out.println("Thank You");
            }
        }else System.out.println("THANK YOU");
    }

    private void init() {
        mainMenu();
    }

    public static void main(String[] args) {
        BackStack bs = new BackStack();
        bs.init();
    }
}
