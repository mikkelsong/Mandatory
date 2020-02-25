public class Week8 {

    public int sumLimit(int a, int b) {

        if (String.valueOf(a+b).length()==String.valueOf(a).length()){
            return a+b;
        }
        return a;
    }

    public String fizzString2(int n) {
        if (n%5==0&&n%3==0){
            return "FizzBuzz!";
        }
        if (n%5==0){
            return "Buzz!";
        }
        if (n%3==0){
            return "Fizz!";
        }
        return Integer.toString(n)+"!";
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles&&die1==die2&&die1==6){
            return 7;
        }
        if (noDoubles&&die1==die2){
            return die1+die2+1;
        }
        return die1+die2;
    }

    public boolean specialEleven(int n) {
        if (n%11<=1) {
            return true;
        }
        return false;
    }

}
