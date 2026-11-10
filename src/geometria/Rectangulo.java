package geometria;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException(
                    "La base debe ser positiva"
            );
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException(
                    "La altura debe ser positiva"
            );
        }
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void imprimirDatos() {

        System.out.println("\n=== RECTÁNGULO ===");

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);

        super.imprimirDatos();
    }
}