package patternInterpreter2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	String roman = "MMXX";

	/*
	 * Context ustawia input na nasz string
	 */

	Context context = new Context(roman);

	/*
	 * tworzymy arrayliste z obiektami reprezentujacymi rzędy wielkości liczby
	 */
	List<Expression> tree = new ArrayList<Expression>();
	tree.add(new ThousandExpression());
	tree.add(new HundredExpression());
	tree.add(new TenExpression());
	tree.add(new OneExpression());

	for (Expression exp : tree) {

	    /*
	     * wywołujemy metodę interpret z klasy abstrakcyjnej iteracyjnie z obiektami
	     * interpretującymi tysiące, setki itp
	     * metoda za każdym wywołaniem obcina context o jedną literę
	     * co pozwala na przejscie przy kazdej iteracji do odpowiedniej litery
	     * 
	     */
	    exp.Interpret(context);
	}

	System.out.println("{" + roman + "} = {" + context.get_output() + "}");
    }

}
