/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlerestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CircleJerseyClient;


/**
 *
 * @author jirap
 */
public class CircleRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleJerseyClient client = new CircleJerseyClient();
        String xml = client.getXml("7");
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("Area : " + res.getArea());
        System.out.println("Circum : " + res.getCircum());
    }
    
}
