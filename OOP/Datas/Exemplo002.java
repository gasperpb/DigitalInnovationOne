package OOP.Datas;

import java.sql.Date;

/**
 * Exemplo002.
 *
 * @author	Vasconcelos Achilles
 * @since	v0.0.1
 * @version	v1.0.0	Sunday, April 5th, 2020.
 * @global
 */
public class Exemplo002 {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        //1586139064444
        
        Date novaData = new Date(currentTimeMillis);
     
        System.out.println(novaData);
        //2020-04-05
    }
}