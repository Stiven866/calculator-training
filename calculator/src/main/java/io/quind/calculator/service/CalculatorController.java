package io.quind.calculator.service;


import io.quind.calculator.domain.Calculate;
import io.quind.calculator.model.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
public class CalculatorController {

    Result result = new Result();
    Calculate ist = new Calculate();

    @RequestMapping("/add")
    public Result addGetRequest(
            @RequestParam(name = "number1", defaultValue = "0") int num1,
            @RequestParam(name = "number2", defaultValue = "0") int num2){
        result.setResult(ist.addTwoNumber(num1,num2));
        return result;
    }

    @RequestMapping("/sub")
    public Result subGetRequest(
            @RequestParam(name = "number1", defaultValue = "0") int num1,
            @RequestParam(name = "number2", defaultValue = "0") int num2){
        System.out.println("eeeeee");
        result.setResult(ist.subTwoNumber(num1,num2));
        return result;
    }

    @RequestMapping("/div")
    public Result divGetRequest(
            @RequestParam(name = "number1", defaultValue = "0") int num1,
            @RequestParam(name = "number2", defaultValue = "0") int num2){
        result.setResult(ist.divTwoNumber(num1,num2));
        return result;
    }

    @RequestMapping("/mult")
    public Result multGetRequest(
            @RequestParam(name = "number1", defaultValue = "0") int num1,
            @RequestParam(name = "number2", defaultValue = "0") int num2){
        result.setResult(ist.multTwoNumber(num1,num2));
        return result;
    }

}
