package de.hbrs.team89.se1_starter_repo.Controller;

import de.hbrs.team89.se1_starter_repo.ParkhausServlet;

import java.util.List;

public class ServletController {
    private List<ParkhausServlet> levels;

    public void addLevel(ParkhausServlet level){
        levels.add(level);
    }

    public boolean checkSpace() {
        if(levels!=null) {
            for (int i = 0; i < levels.size(); i++) {
                if (levels.get(i).hasSpace()){
                    return true;
                }
            }
        }
        return false;
    }
}
