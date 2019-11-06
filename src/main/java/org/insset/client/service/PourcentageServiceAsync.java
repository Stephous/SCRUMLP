/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author user
 */
public interface PourcentageServiceAsync {

    /**
     * AsyncCallback pour Convertion Chiffre romain en chiffre arabe
     *
     * @param nbr
     * @return
     * @throws IllegalArgumentException
     */
    void NewValue(Integer nbr, Integer pc, AsyncCallback<Integer> callback);

    void PreValue(Integer nbr, Integer pc, AsyncCallback<Integer> callback);

}
