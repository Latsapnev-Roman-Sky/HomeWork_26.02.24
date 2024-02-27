package pro.sky.calculator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    public String printGreetings() {
        return "Добро пожаловать в калькулятор";
    }

    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно введен запрос, укажите значение.";
        }
        return calculatorService.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно введен запрос, укажите значение.";
        }
        return calculatorService.minus(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно введен запрос, укажите значение.";
        }
        return calculatorService.multiply(num1,num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1",required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Неверно введен запрос, укажите значение.";
        } else if (num1 != null && num2 != null) {
            if (num2 == 0) {
                return "Ошибка! На ноль делить нельзя.";
            }
        }
        return calculatorService.divide(num1,num2);
    }

}
