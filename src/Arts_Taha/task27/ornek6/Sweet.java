package Arts_Taha.task27.ornek6;

import task27.ornek6.Food;

public abstract class Sweet extends Food {

  //  public abstract void madeIn();//abs meth childe'a zorla implement edilmesi için tanımlanır

    @Override
    public void madeIn() {// conc meth childi overrdie etmek te serbest

    }

    @Override
    public void taste() {
        System.out.println("good sugar  sweet");
    }
}
