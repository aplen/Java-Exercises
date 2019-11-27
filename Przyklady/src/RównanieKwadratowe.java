
public class RównanieKwadratowe {

    int a;
    int b;
    int c;

    public RównanieKwadratowe(int a, int b, int c) // konstruktor o nazwie klasy, pozwalający zainicjować nowe obiekty
    {
	this.a = a; // przypisanie fieldom klasy zmienne parametryczne
	this.b = b; // nie musza sie nazywac tak samo
	this.c = c;
    }

    public String rozwiąż() // metoda rozwiązująca równanie mogłay być jako void drukujac rozwiązanie na
			    // konsoli
			    // ale tak jest lepiej metoda klasy String zwracająca łańcuch tekstowy
			    // zawierający rozwiązanie
			    // metoda bez parametrów jawnych poniewaz będzie operowała na obiekcie

    {
	String rozwiązanie = ""; // bo zwraca returnem. nie tworzymy jako pole(czemu?)

	double delta;

	delta = (b * b - 4 * a * c);

	if (delta > 0) {
	    delta = Math.sqrt(delta);
	    double x1 = (-b - delta) / (2 * a);
	    double x2 = (-b + delta) / (2 * a);

	    rozwiązanie = "Równanie posiada dwa pierwiastki rzeczywiste: " + x1 + " " + x2;
	}

	else if (delta == 0) {
	    delta = Math.sqrt(delta);
	    double x0 = -b / (2 * a);
	    rozwiązanie = "Równanie posiada jeden pierwiastek rzeczywisty: " + x0;
	}

	else {
	    rozwiązanie = "Brak pierwiastków rzeczywistych";
	}
	return rozwiązanie;
    }

    public static void main(String[] args)

    {
	RównanieKwadratowe równanie = new RównanieKwadratowe(1, 4, 2); // nazwa klasy new(wywołuje konstruktor)nazwa
								       // klasy i podajemy parametry
	System.out.println(równanie.rozwiąż()); // pokazuje obiekt równania na ekranie (wynik)
    }
}