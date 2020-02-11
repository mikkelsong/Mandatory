public class Uge6 {

    public boolean love6(int a, int b) {
        if (a==6||b==6||a+b==6||a-b==6||b-a==6){
            return true;
        }
        return false;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk&&c>=b&&b>=a){
            return true;
        }
        if (c>b&&b>a){
            return true;
        }
        return false;
    }

    public int sortaSum(int a, int b) {
        if (a+b>9&&a+b<20){
            return 20;
        }
        return a+b;
    }

    public boolean old35(int n) {
        if(n%3==0&&n%5==0){
            return false;
        }
        if (n%3==0||n%5==0){
            return true;
        }
        return false;
    }


}
