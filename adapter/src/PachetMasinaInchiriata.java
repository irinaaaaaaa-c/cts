public class PachetMasinaInchiriata implements PachetTuristic{

    private MasinaInchiriata masina;

    public PachetMasinaInchiriata(MasinaInchiriata masina) {
        this.masina = masina;
    }

    @Override
    public void descriere() {

        System.out.println(this.masina.toString());
    }

    @Override
    public void rezervaPachet() {

        this.masina.inchiriazaMasina();
    }
}
