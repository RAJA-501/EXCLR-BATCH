public class nextMultipleOf100 {

    public static int nextMultipleOf100(int number) {
        
        if (number % 100 == 0) {
            return number;
        }
        
        return ((number / 100) + 1) * 100;
    }

    public static void main(String[] args) {
        int number = 245; 
        int nextMultiple = nextMultipleOf100(number);
        System.out.println("The next multiple of 100 after " + number + " is: " + nextMultiple);
    }
}