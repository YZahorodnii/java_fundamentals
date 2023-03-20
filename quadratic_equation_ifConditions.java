public class quadratic_equation_ifConditions {
    public static void main(String[] args) {
//    ax2 + bx + c = 0
        double a = 0;
        double b = 0;
        double c = 0.1;
        double d = Math.sqrt(b * b - 4 * a * c);

        if (a == 0 && c == 0 && b != 0 || a != 0 && b == 0 && c == 0) {
            double x1 = 0;
            double x2 = 0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            System.out.println(Math.sqrt(0*0));

        } else if ((a == 0 && c == 0 && b == 0) || (a == 0 && b == 0 )) {
            System.out.println("x1=");
            System.out.println("x2=");
            System.out.println("NaN");

        } else if (d > 0) {
            double x1 = (-(b) + d) / (2 * a);
            double x2 = (-(b) - d) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            System.out.println("d>0");

        } else if (d == 0) {
            double x1 = -(b) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x1);
            System.out.println("d=0");

        } else if (d < 0) {
            System.out.println("x1=0.0");
            System.out.println("x2=0.0");
            System.out.println("d<0");
        }
    }
//      if (x1 % 1 ==0) {
//          System.out.println("x1 =" + x1);
//      } else {
//          System.out.println("x1 =");
//      }
//      if (x2 % 1 ==0) {
//      } else {
//          System.out.println("x2 =");
//      }
};