package metodaSzablonowa;

public abstract class AbstractClass {

    /*
     * Zdefiniowanie szkieletu algorytmu. Oddzielenie części logiki do klas
     * dziedziczących po klasie AbstractClass(klasie bazowej) bez zmieniania
     * podstawowej struktury algorytmu. Zaimplementowanie niezmiennej części
     * algorytmu.
     */
    
    public void TemplateMethod() {
	StepOne();
	StepTwo();
	System.out.println("");
    }

    public abstract void StepOne();

    public abstract void StepTwo();

}