package programadependencia.model;

public class Motor {
    private int cilindros;
    private double cilindradas;

    public Motor(int cilindros, double cilindradas) {
        this.cilindros = cilindros;
        this.cilindradas = cilindradas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindros=" + cilindros + ", cilindradas=" + cilindradas + '}';
    }
    
}
