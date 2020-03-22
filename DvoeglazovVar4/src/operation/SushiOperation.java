/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;

import types.Sushi;
/**
 *
 * @author dvoeg
 */
public interface SushiOperation {

List<Sushi> getListOfSushi();

List<Sushi> addNewSushi(Sushi item);

int getSumOfSushi();

}
