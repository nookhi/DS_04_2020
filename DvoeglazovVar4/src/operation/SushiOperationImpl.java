/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;

import java.util.List;

import types.Sushi;

/**
 *
 * @author dvoeg
 */
public class SushiOperationImpl implements SushiOperation {

    static List<Sushi> lstSushi = new ArrayList<Sushi>();

    @Override

    public List<Sushi> getListOfSushi() {

        return lstSushi;

    }

    @Override

    public List<Sushi> addNewSushi(Sushi item) {

        lstSushi.add(item);

        return lstSushi;

    }

    @Override

    public int getSumOfSushi() {

        int sum = 0;

        for (Sushi sushi : lstSushi) {
            sum += sushi.getQuantity() * sushi.getPrice();
        }
        return sum;

    }
}
