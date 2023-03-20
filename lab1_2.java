

public class lab1_2 {
    public static void main(String[] args){
        //1.2 Write a program to show the use of switch-case.
        

        /* Theory
         * There can be one or N number of case values for a switch expression.
            The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
            The case values must be unique. In case of duplicate value, it renders compile-time error.
            The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
            Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
            The case value can have a default label which is optional.
         */

         int a = 69;
         switch(a){
            case 23: System.out.println("the value is 23.");
            break;
            case 47: System.out.println("the value is 47.");
            break;
            case 69: System.out.println("The value is 69");
            break;
            default : System.out.println("Something went wrong");
         }
        }
    }

