package pro.sky.calculator.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    public String printGreetings() {
        return "Добро пожаловать в калькулятор";
    }

}
