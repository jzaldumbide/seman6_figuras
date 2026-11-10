package geometria;

public class Triangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(
            String color,
            double lado1,
            double lado2,
            double lado3) {

        super(color);
        setLados(lado1, lado2, lado3);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLados(
            double lado1,
            double lado2,
            double lado3) {

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException(
                    "Los lados deben ser positivos"
            );
        }

        if (lado1 >= lado2 + lado3 ||
                lado2 >= lado1 + lado3 ||
                lado3 >= lado1 + lado2) {

            throw new IllegalArgumentException(
                    "Los lados no forman un triángulo"
            );
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {

        double s = calcularPerimetro() / 2.0;

        return Math.sqrt(
                s * (s - lado1) *
                        (s - lado2) *
                        (s - lado3)
        );
    }

    @Override
    public void imprimirDatos() {

        System.out.println("\n=== TRIÁNGULO ===");

        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);

        super.imprimirDatos();
    }
}