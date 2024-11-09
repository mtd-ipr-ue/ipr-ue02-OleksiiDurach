import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {

        Out.print("Enter x coordinate of your point ");
        double x = In.readDouble();

        Out.print("Enter y coordinate of your point ");
        double y = In.readDouble();

        int r = 4;

        double distanceToCenter = 0;

        if (0 <= x && x <= 4 && 0 <= y && y <= 4) {

            distanceToCenter = Math.sqrt(x*x+y*y);

            if (distanceToCenter > r) {
                Out.print("Your point lies within green area");
            } else {
                Out.print("Your point does not lies within green area");
            }

        } else {
            Out.print("Your point is out of bounds");
            System.exit(-1);
        }

    }
}
