package budowniczy.copy;

public class BurgerExample {

    public static void main(String[] args) {

	BurgerBuilder builder = new BurgerBuilderImpl();
	/*
	 * builder zgodnie ze swoim konstruktorem stworzyl nowy obiekt Burger
	 *  co wyswietlamy ponizej na konsoli
	 */
	System.out.println(builder);

	builder.setMeat("podwójna wołowina");
	builder.setSauce("czosnkowy");
	/*
	 * ustawilismy builderowi nowe argumenty sprawdzmy teraz, jak wyglada nasz
	 * obiekt
	 */
	System.out.println(builder);

	/*
	 * metoda build wyciagamy nasz obiekt Burger z BurgerBuildera i przypisujemy do zmiennej
	 */
	Burger myBurger = builder.build();

	System.out.println(myBurger);
    }

}
