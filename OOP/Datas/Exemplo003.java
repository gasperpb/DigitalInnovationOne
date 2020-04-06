package OOP.Datas;

import java.sql.Date;

public class Exemplo003 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691l);
        System.out.println(dataNoPassado);
        //2017-12-12

        Date dataNofuturo = new Date(1613124807691l);
        System.out.println(dataNofuturo);
        //2021-02-12

        boolean isAfter = dataNoPassado.after(dataNofuturo);
        System.out.println(isAfter);
        //false

        //** Comparando se a dataNoPassado é anterior a dataNoFuturo  */
        boolean isBefore = dataNoPassado.before(dataNofuturo);

        System.out.println(isBefore);
        //true
    
    }


}