package patternFasada;

public class Main {

    public static void main(String[] args) {
	/*
	 * implementacja metod ukryta przed użytkownikiem w klasie Facade
	 */

	Facade Klient = new Facade();
	Klient.pobieraniePaczki();
    }

}
