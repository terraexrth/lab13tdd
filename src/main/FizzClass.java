package main;

public class FizzClass {
    int i;
    public FizzClass(int i){
        this.i = i;
    }
    public String  FizzBuzzCal(){
        String result = null;
        //we should limit input number to not more than 100
        if(i>100){
            return "its over than 100";
        }
        //we should have minimum input to more than 0
        //
        if(i % 3 == 0 && i % 5 ==0){
            result = "FizzBuzz";
        }
        else if(i % 3 != 0 && i % 5 != 0){
            result = String.valueOf(i);
        }else if(i % 3 == 0) {
            result = "Fizz";
        }else if(i % 5 == 0){
            result = "Buzz";
        }

        return result;
    }
}
