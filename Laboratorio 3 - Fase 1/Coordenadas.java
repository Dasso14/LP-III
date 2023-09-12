package Manejadorrect;

class Coordenada {
    private int x;
    private int y;

    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(Coordenada c) {
        int deltaX = this.x - c.getX();
        int deltaY = this.y - c.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double distancia(Coordenada c1, Coordenada c2) {
        int deltaX = c1.getX() - c2.getX();
        int deltaY = c1.getY() - c2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
