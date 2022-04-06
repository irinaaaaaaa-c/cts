package Main;

import clase.*;

public class Main {
    public static void valideazaBilet(ValidatorTerestru validatorTerestru) {
        validatorTerestru.valideazaBilet();

    }
    public static void main(String[] args) {
        ValidatorSubteran validatormetrou=new ValidatorMetrou();
        ValidatorTerestru  validatorAutobuz=new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        // PENTRU A MERGE TREBUIE SA ADAPATAM ACEST VALIDATOR PENTRU A MERGE APLICATIA
        //valideazaBilet(validatormetrou);

        Adapter adapter=new Adapter(validatormetrou);
        valideazaBilet(adapter);


    }
}
