package io.quind.calculator.domain;

import io.quind.calculator.model.Result;

public class Calculate {
    private Result result = new Result();

    public int addTwoNumber(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

    public int subTwoNumber(int num1, int num2){
        int res = num1 - num2;
        return res;
    }

    public int divTwoNumber(int num1, int num2){
        int res;
        if(num2!=2){
              res= num1 / num2;
            return res;
        }else{
            return 0;
        }

    }
    public int multTwoNumber(int num1, int num2){
        int res = num1 * num2;
        return res;
    }
}
