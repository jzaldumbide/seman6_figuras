package geometria;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException(
                    "El radio debe ser positivo"
            );
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void imprimirDatos() {

        System.out.println("\n=== CÍRCULO ===");

        System.out.println("Radio: " + radio);

        // Ejecuta el método de la clase padre
        super.imprimirDatos();
    }
}