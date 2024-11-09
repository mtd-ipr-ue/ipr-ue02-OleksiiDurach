import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Entereth thre hol somme."); //Enter three whole numbers (Written in Middle English)

        Out.print("1) ");
        int first = In.readInt();

        Out.print("2) ");
        int second = In.readInt();

        Out.print("3) ");
        int third = In.readInt();

        int largest;

        if (first > second && first > third) {
            largest = first;
        } else if (second > third && second > first) {
            largest = second;
        } else {
            largest = third;
        }

        Out.print(largest + " is the gretteste hol somme entred by thee."); //  is the biggest whole number of entered by you

    }
}
