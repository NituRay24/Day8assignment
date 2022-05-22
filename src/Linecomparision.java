public class Linecomparision {
    public double FindLength() {
        double x1 = 10d;
        double y1 = 20d;
        double x2 = 10d;
        double y2 = 20d;
        double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line 1 : " + lengthOfLine1);
        System.out.println("Length of line 2 : " +lengthOfLine1);
        return lengthOfLine1;

    }
    // @equalityOfLength is a method for checking equality of two length using java equal meth//
         public void equalityOfLines() {
        double line1 = FindLength();
        String s1 = Double.toString(line1);
        String s2 = Double.toString(line1);
        if (s1.equals(s2))
            System.out.println("Both lines are same in length");
        else
            System.out.println("Both the lines are different in length");
    }


     // @compareLength this is a method for comparing length of two line as string using compareTo method of java.


    public void compareLength() {
        double line1 = FindLength();
        String s1 = Double.toString(line1);
        String s2 = Double.toString(line1);
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
        length.FindLength();
        length.equalityOfLines();
        length.compareLength();
    }
}
