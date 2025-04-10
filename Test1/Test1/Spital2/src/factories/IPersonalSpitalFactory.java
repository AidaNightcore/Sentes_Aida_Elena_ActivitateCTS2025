package factories;

import clase.PersonalSpital;

public interface IPersonalSpitalFactory {

    PersonalSpital buildPersonalSpital(TipPersonalSpital tipPersonalSpital, String personalSpital);
}
