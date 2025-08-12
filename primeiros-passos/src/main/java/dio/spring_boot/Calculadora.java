package dio.spring_boot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }
}
