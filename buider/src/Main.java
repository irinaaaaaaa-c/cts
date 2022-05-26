public class Main {
    public static void main(String[] args) {
        ContBancar cont=new ContBancar();
        cont.setContSalariu(true);
        System.out.println(cont);

        ContBancar contBancar=new ContBancarBuilder().setDetinator("Andreea").setSumaBlocata(1000).setSuma(10).setMoneda("lei").build();
        System.out.println(contBancar);
    }
}
