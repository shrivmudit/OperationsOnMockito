public class MockitoMethods {
    MockitoArithmeticOperations arithmetic;
    public MockitoMethods(MockitoArithmeticOperations arithmetic) {
        this.arithmetic = arithmetic;
    }

    public double sum(double input1, double input2) {
        return input1+input2;
    }

    public double difference(double input1, double input2) {
        return input1 - input2;
    }

    public double product(double input1, double input2) {
        return input1*input2;
    }

    public double division(double input1, double input2) {
        return input1/input2;
    }
}