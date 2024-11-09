import libraries.In;
import libraries.Out;

public class ue02_2 {
  public static void main(String[] args) {
    Out.println("Enter a year and a order number of a month, to check how many days in this month");

    Out.print("Year ");
    int year = In.readInt();

    Out.print("Month ");
    int month = In.readInt();

    switch(month) {
        case 1:
            Out.print("31 days");
            break;
        case 2:
            if (year % 4 == 0) {
                Out.print("29 days");
            } else {
                Out.print("28 days");
            }
            break;
        case 3:
            Out.print("31 days");
            break;
        case 4:
            Out.print("30 days");
            break;
        case 5:
            Out.print("31 days");
            break;
        case 6:
            Out.print("30 days");
            break;
        case 7:
            Out.print("31 days");
            break;
        case 8:
            Out.print("31 days");
            break;
        case 9:
            Out.print("30 days");
            break;
        case 10:
            Out.print("31 days");
            break;
        case 11:
            Out.print("30 days");
            break;
        case 12:
            Out.print("31 days");
            break;
        default:
            Out.print("Enter a proper order number");
    }
  }
}
