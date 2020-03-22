/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;
import java.util.ArrayList;

import java.util.List;

import types.SushiDirectory;
/**
 *
 * @author dvoeg
 */
public class SushiOperationImplDirectory implements SushiOperationDirectory{
    
    static List<SushiDirectory> lstSushiDirectory = new ArrayList<SushiDirectory>();
    
static{

lstSushiDirectory .add(new SushiDirectory("Яки", "Cуши", "Рис, что-то еще"));

lstSushiDirectory .add(new SushiDirectory("Нигири", "Cуши", "Рис, что-то еще"));

lstSushiDirectory .add(new SushiDirectory("Спайси", "Cуши", "Рис, что-то еще"));

lstSushiDirectory .add(new SushiDirectory("Инь-Янь", "Роллы", "Рис, что-то еще"));

lstSushiDirectory .add(new SushiDirectory("Филадельфия", "Роллы", "Рис, что-то еще"));

lstSushiDirectory .add(new SushiDirectory("Калифорния", "Роллы", "Рис, что-то еще"));
}
    @Override

    public List<SushiDirectory> getListOfSushiDirectory() {

        return lstSushiDirectory;

    }

    @Override

    public List<SushiDirectory> addNewSushiDirectory(SushiDirectory item) {

        lstSushiDirectory.add(item);

        return lstSushiDirectory;

    }
}
