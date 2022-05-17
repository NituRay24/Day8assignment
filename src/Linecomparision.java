public class Linecomparision {
    public double coordinatesForLine1() {
        double x1 = 10d;
        double y1 = 20d;
        double x2 = 10d;
        double y2 = 20d;
        double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line 1 : " + lengthOfLine1);
        return lengthOfLine1;
    }

     // @return Length of line 2
     // @coordinatesForLine1 is a method for line 2 coordinates And calculating length of line 1.


    public double coordinatesForLine2() {
        double x1 = 30d;
        double y1 = 20d;
        double x2 = 30d;
        double y2 = 20d;
        double lengthOfLine2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line 2 : " + lengthOfLine2);
        return lengthOfLine2;
    }


     // @equalityOfLength is a method for checking equality of two length using java equal method


    public void equalityOfLength() {
        double line1 = coordinatesForLine1();
        String s1 = Double.toString(line1);
        double line2 = coordinatesForLine2();
        String s2 = Double.toString(line2);
        if (s1.equals(s2))
            System.out.println("Both lines are same in length");
        else
            System.out.println("Both the lines are different in length");
    }


     // @compareLength this is a method for comparing length of two line as string using compareTo method of java.


    public void compareLength() {
        double line1 = coordinatesForLine1();
        String s1 = Double.toString(line1);
        double line2 = coordinatesForLine2();
        String s2 = Double.toString(line2);
        if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + " is less than the" + s2);
            System.out.println("s2 string is greater");
        } else {
            System.out.println(s1 + " is greater than the " + s2);
            System.out.println("s1 string is greater");
        }
    }

     // @Main is a main method of  class


    public static void main (String[] args){
        Linecomparision length = new Linecomparision();
        System.out.println("Welcome to Line Comparison Computation Program");
        length.coordinatesForLine1();
        length.coordinatesForLine2();
        length.equalityOfLength();
        length.compareLength();
    }
}
