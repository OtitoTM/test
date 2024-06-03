package newCALC.app.service.DTO;

public class MathResponse {
    private double number1;
    private double number2;
    public double add;
    public double subtract;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public double getSubtract() {
        return subtract;
    }

    public void setSubtract(double subtract) {
        this.subtract = subtract;
    }

    @Override
    public String toString() {
        return "MathResponse{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", add=" + add +
                ", subtract=" + subtract +
                '}';
    }
}
