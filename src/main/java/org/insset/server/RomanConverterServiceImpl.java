/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import static com.google.gwt.thirdparty.javascript.rhino.IR.string;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.Arrays;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        return 3;
    }
    
    public static String convertArrayToString(String[] strArray) {

        return Arrays.toString(strArray);

    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        
        String T_Unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String T_Diz[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String T_Cent[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String T_M[]={"","M"};
        //Implement your code
      
            String str=nbr.toString(); //1363-> "1363"
            String[] s = str.split(""); //"1363"-> [1,3,6,3] String
            
            int size = s.length;
            int [] arr = new int [size];           
            for(int i=0; i<size; i++) {
                arr[i] = Integer.parseInt(s[i]); //String->Int
            }
            String[] chaine = new String[size];
            switch(s.length) {
                case 1:
                  chaine = new String[] {T_Unit[arr[0]]};
                  break;
                case 2:
                  chaine = new String[] {T_Diz[arr[0]],T_Unit[arr[1]]};
                  break;
                case 3:
                  chaine = new String[] {T_Cent[arr[0]],T_Diz[arr[1]],T_Unit[arr[2]]};
                break;
                case 4:
                  chaine = new String[] {T_M[arr[0]],T_Cent[arr[1]],T_Diz[arr[2]],T_Unit[arr[3]]};
                break;
            }

         String joinedString = String.join("", chaine);
            return joinedString;
            
    } 
        

}
