package newCALC.app.service;

import newCALC.app.service.DTO.MathRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

}
