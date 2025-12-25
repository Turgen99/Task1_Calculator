public class CalculatorFunctions {

    // Addition (Toplama)
    public double add(double a, double b){
        return a+b;
    }

    // Subtraction (Çıkarma)
    public double subtract(double a, double b){
        return a - b;
    }

    // Multiplication (Çarpma)
    public double multiply(double a, double b){
        return a * b;
    }

    // Division (Bölme)
    public double divide(double a, double b){
        if (b == 0) {
            System.out.println("Error: Sıfıra Bölünmez!");
            return 0;
        }
        return a / b;
    }

    // Square Root (Karekök)
    public double sqrt(double a){
        if (a < 0){
            System.out.println("Error:Negatif sayının karekökü alınmaz!");
            return 0;
        }
        return Math.sqrt(a);
    }

    // Exponentiation (Üs Alma)
    public double power(double base, double exponent){
        return Math.pow(base, exponent);
    }
}
