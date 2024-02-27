package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private int num1;
    private int num2;

    public String plus(Integer num1, Integer num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(Integer num1, Integer num2) {
        return num1+" - "+num2+" = "+(num1-num2);
    }

    public String multiply(Integer num1, Integer num2) {
        return num1+" * "+num2+" = "+(num1*num2);
    }

    public String divide(Integer num1, Integer num2) {
        return num1+" / "+num2+" = "+(num1/num2);
    }
}
