package OOP.Datas;

import java.util.Calendar;
import java.util.Scanner;

public class Exemplo004 {
    /**
     * main.
     *
     * @author Vasconcelos Achilles
     * @since v0.0.1
     * @version v1.0.0 Tuesday, April 7th, 2020.
     * @access public static
     * @param mixed Strin
     * @return void
     */
    public static void main(String[] args) {
        /**
         * @var scanner sc to be able to add the deadline
         */
        Scanner sc = new Scanner(System.in);
        Calendar pagamento = Calendar.getInstance();
        System.out.println("Add for deadline");
        int prazo = sc.nextInt(); // date pos deadline
        pagamento.add(Calendar.DATE, +prazo);// add the date of deadline

        if (Calendar.WEEK_OF_MONTH == 1) {
            pagamento.add(Calendar.DATE, +1);
            System.out.println(pagamento);

        } else if (Calendar.WEEK_OF_MONTH == 7) {
            pagamento.add(Calendar.DATE, +2);
            System.out.println(pagamento);
        } else {
            System.out.println(pagamento);
        }

    }

}