class Punto {
    // Atributos
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters y Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanciaAlOrigen() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distanciaOtroPunto(Punto otro) {
        double deltaX = otro.getX() - this.x;
        double deltaY = otro.getY() - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Método para desplazar el punto sumando un desplazamiento en X y en Y
    public void desplazar(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")";
    }

    public static void main(String[] args) {
        // 1. Crear dos puntos
        Punto p1 = new Punto(3.0, 4.0);
        Punto p2 = new Punto(6.0, 8.0);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);

        // 2. Calcular distancias iniciales
        System.out.println("\n--- CÁLCULO DE DISTANCIAS INICIALES ---");
        System.out.println("Distancia de P1 al origen (0, 0): " + String.format("%.2f", p1.distanciaAlOrigen()));
        System.out.println("Distancia de P2 al origen (0, 0): " + String.format("%.2f", p2.distanciaAlOrigen()));
        System.out.println("Distancia entre P1 y P2: " + String.format("%.2f", p1.distanciaOtroPunto(p2)));

        // 3. Modificar (desplazar) uno de ellos
        System.out.println("\n--- DESPLAZAMIENTO ---");
        System.out.println("Desplazando Punto 1 en (+2 en X, -1 en Y)...");
        p1.desplazar(2.0, -1.0);
        System.out.println("Nuevo Punto 1: " + p1);

        // 4. Recalcular distancias tras la modificación
        System.out.println("\n--- RECÁLCULO DE DISTANCIAS ---");
        System.out.println("Nueva distancia de P1 al origen: " + String.format("%.2f", p1.distanciaAlOrigen()));
        System.out.println("Nueva distancia entre P1 y P2: " + String.format("%.2f", p1.distanciaOtroPunto(p2)));
    }
}

