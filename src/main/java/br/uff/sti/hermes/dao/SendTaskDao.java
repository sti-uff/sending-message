/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.hermes.dao;

import br.uff.sti.hermes.model.SendTask;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface SendTaskDao {

    public List<SendTask> getAll();

    public SendTask getById(int id);

    public void save(SendTask task);
}