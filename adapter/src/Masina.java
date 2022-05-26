public class Masina{

    private String model;
    private double capacitateCilindrica;

    public Masina(String model, double capacitateCilindrica) {
        this.model = model;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public String toString() {
        return "MasinaInchriata{" +
                "model='" + model + '\'' +
                ", capacitateCilindrica=" + capacitateCilindrica +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(double capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }
}
