import java.util.Scanner;

class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Digite a temperatura: ");
        temp = scanner.nextDouble();

        System.out.print("Converter para Celsius ou Fahrenheit (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp = unit.equals("C")
                ? (temp - 32) * 5 / 9
                : (temp * 9 / 5) + 32;

        System.out.printf("A temperatura convertida é: %.1f°%s\n", newTemp, unit);

        scanner.close();
    }
}