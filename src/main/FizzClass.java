package main;

public class FizzClass {
    int i;
    public FizzClass(int i){
        this.i = i;
    }
    public String  FizzBuzzCal(){
        String result = null;
        //if %3 == 0 result choose be Fizz
        if(i % 3 != 0 && i % 5 != 0){
            result = String.valueOf(i);
        }else if(i % 3 == 0) {
            result = "Fizz";
        }else if(i % 5 == 0){
            result = "Buzz";
        }
        return result;
    }
}
