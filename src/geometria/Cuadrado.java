package geometria;

public class Cuadrado extends FiguraGeometrica {

    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException(
                    "El lado debe ser positivo"
            );
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void imprimirDatos() {

        System.out.println("\n=== CUADRADO ===");

        System.out.println("Lado: " + lado);

        super.imprimirDatos();
    }
}