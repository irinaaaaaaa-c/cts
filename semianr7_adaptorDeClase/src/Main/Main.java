package Main;

import Clase.AdaptorDeClase;
import Clase.ValidatorAutobuz;
import Clase.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz=new ValidatorAutobuz();
        validatorAutobuz.valideazaAbonament();
        validatorAutobuz.valideazaBilet();
        ValidatorTerestru validatorMetrou=new AdaptorDeClase();
        
    }
}
