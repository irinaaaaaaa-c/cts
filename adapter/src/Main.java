public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare=new PachetCazare();
        Masina masina = new Masina("Opel", 1300);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu se foloseste metoda de printare.");
        System.out.print("Pentru client: ");
        System.out.println(masinaInchiriata.toString());
        System.out.print("Pentru Operator: ");
        masinaInchiriata.inchiriazaMasina();
    }
}
