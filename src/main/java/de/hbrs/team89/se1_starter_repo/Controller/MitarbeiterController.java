package de.hbrs.team89.se1_starter_repo.Controller;

import de.hbrs.team89.se1_starter_repo.models.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterController {
    private static List<Mitarbeiter> mitarbeiterList;

    public static List<Mitarbeiter> getMitarbeiterList() {
        return mitarbeiterList;
    }
    public static void addMitarbeiter(Mitarbeiter mitarbeiter){
        mitarbeiterList.add(mitarbeiter);
    }
    public static Mitarbeiter deleteMitarbeiter(int index){
        return mitarbeiterList.remove(index);
    }
    public static Mitarbeiter findMitarbeiter(String name){
        while (mitarbeiterList.listIterator().hasNext()){
            if(mitarbeiterList.listIterator().next().getName().equals(name)){
                return mitarbeiterList.listIterator().next();
            }
        }return null;
    }
    public static ArrayList<String> getAllNames(){
        ArrayList<String> names = new ArrayList<>();
        while (mitarbeiterList.listIterator().hasNext()){
            names.add(mitarbeiterList.listIterator().next().getName());
        }
        return names;
    }
}
