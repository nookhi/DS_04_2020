/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;

import types.SushiDirectory;
/**
 *
 * @author dvoeg
 */
public interface SushiOperationDirectory {

List<SushiDirectory> getListOfSushiDirectory();

List<SushiDirectory> addNewSushiDirectory(SushiDirectory item);

}