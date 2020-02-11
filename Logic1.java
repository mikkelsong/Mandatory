public class Logic1{


    public boolean lastDigit(int a, int b, int c) {

        if (a%10==b%10||c%10==b%10||a%10==c%10){
            return true;
        }
        return false;
    }

    public String fizzString(String str) {
        if (str.startsWith("f")&& str.endsWith("b")){
            return "FizzBuzz";
        }
        if (str.startsWith("f")){
            return "Fizz";
        }
        if (str.startsWith("f")){
            return "Fizz";
        }
        if (str.endsWith("b")){
            return "Buzz";
        }
        return str;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer&&temp>=60&&temp<=100){
            return true;
        }
        if (temp>=60&&temp<=90){
            return true;
        }
        return false;
    }

    public int greenTicket(int a, int b, int c) {
        if (a==b&&b==c) {
            return 20;
        }
        if (a==b||b==c||c==a){
            return 10;
        }
        return 0;
    }

}