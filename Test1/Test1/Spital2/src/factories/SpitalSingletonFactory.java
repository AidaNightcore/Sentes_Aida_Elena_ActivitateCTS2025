package factories;

import clase.PersonalSpital;

public class SpitalSingletonFactory {
    private static SpitalSingletonFactory instance = null;

    private SpitalSingletonFactory(){}
    public static synchronized SpitalSingletonFactory getInstance(){
        if(instance == null){
            instance = new SpitalSingletonFactory();
        }
        return instance;
    }

    public IPersonalSpitalFactory build(){

    }
}
