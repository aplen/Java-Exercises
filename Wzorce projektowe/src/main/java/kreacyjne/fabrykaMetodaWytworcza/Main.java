package fabrykaMetodaWytworcza;

public class Main {

    public static void main(String[] args) {
	long t1 = System.currentTimeMillis();
	FiguresFactory figuresFactory = new FiguresFactory();
	/*
	 * stworzylismy obiekt fabryki, ktory tworzy rozne obiekty o typie Figura
	 * zaleznie od logiki z metody makeFigure()
	 */

	Figures figure = figuresFactory.makeFigure("Koło", 5);
	Figures figure1 = figuresFactory.makeFigure("Koło", 2);
	Figures figure2 = figuresFactory.makeFigure("Kwadrat", 7);
	Figures figure3 = figuresFactory.makeFigure("Kwadrat", 12.5);

	System.out.println(figure);
	System.out.println(figure1);
	System.out.println(figure2);
	System.out.println(figure3);
	
	long t2 = System.currentTimeMillis();
	long cycleTime = t2-t1;
	System.out.println(cycleTime);
    }
}
