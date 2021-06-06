package ex04.base;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun. ");
        String noun = input.nextLine();

        System.out.print("Enter a verb. ");
        String verb = input.nextLine();

        System.out.print("Enter an adverb. ");
        String adverb = input.nextLine();

        System.out.print("Enter an adjective. ");
        String adjective = input.nextLine();

        String outputString = "Wait, you " + adverb + " " + verb + " your " + adjective + " " + noun + " too? That's neat.";

        System.out.println(outputString);
    }

}
