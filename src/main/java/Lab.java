public class Lab {
    /**
     * Your challenge is to implement a method to determine if an int is even or odd. The method should return
     * the String "Even" if the number is even, and "Odd" if it is odd.
     *
     * @param n a number.
     * @return a String "Even" if n is even, and "Odd" if n is odd. The test cases are case-sensitive.
     */
    public String decide(int n){
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
