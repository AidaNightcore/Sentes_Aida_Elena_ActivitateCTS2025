package main;

import Class.F_Medicament;
import Class.S_Medicament;
import Class.Adapter;
public class Main {
    public static void vindeMedicament(F_Medicament fMedicament){
        fMedicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        F_Medicament fMedicament = new F_Medicament("Normens", 10, 20, "02/2025");
        vindeMedicament(fMedicament);

        S_Medicament sMedicament = new S_Medicament("Ceva", 20);
        Adapter adapter = new Adapter(sMedicament);
        vindeMedicament(adapter);

    }
}