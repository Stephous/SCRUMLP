/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.PourcentageService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class PourcentageServiceImpl extends RemoteServiceServlet implements
        PourcentageService {

    @Override
    public Integer NewValue(Integer nbr, Integer pc) throws IllegalArgumentException {
        //Implement your code
        return (nbr - (nbr * pc) / 100);
    }

    @Override
    public Integer PreValue(Integer nbr, Integer pc) throws IllegalArgumentException {
        //Implement your code
        return ((nbr * (100+pc)) / 100);
    }

}