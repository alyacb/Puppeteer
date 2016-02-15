
package main;

/**
 *
 * @author User
 */
public class AlienClient {
    public static void main(String[] args){
        BasicClient bcican = new BasicClient();
        bcican.establishConnection(4454, "10.22.116.76");
    }
}
