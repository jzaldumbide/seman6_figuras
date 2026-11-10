package geometria;

public class FiguraGeometrica {

    private String color;

    public FiguraGeometrica() {
        this("Sin definir");
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public void imprimirDatos() {
        System.out.println("Color: " + color);
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
    }
}