package newCALC.app.web.rest;

import newCALC.app.service.DTO.MathRequestDTO;
import newCALC.app.service.MathService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/newCalc")
public class MathController {
    MathService mathService = new MathService();

    @PostMapping("/add")
    public double add(@RequestBody MathRequestDTO mathRequestDTO) {
        System.out.println("Received DTO: " + mathRequestDTO);
        return mathService.add(mathRequestDTO.getNumber1(), mathRequestDTO.getNumber2());
    }
        @PostMapping("/subtract")
        public double subtract(@RequestBody MathRequestDTO mathRequestDTO){
            System.out.println("Received DTO: " + mathRequestDTO);
            return mathService.subtract(mathRequestDTO.getNumber1(), mathRequestDTO.getNumber2());
        }

    }



