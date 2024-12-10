public class Main {
    public static void main(String[] args) {
        Spravochnik spravochnik = new Spravochnik();
        spravochnik.add("Гаджиев","7928819495");
        spravochnik.add("Исаев","79288195933");
        spravochnik.add("Грищечкин","7928842126");
        spravochnik.add("Худоян","792883213213");
        spravochnik.add("Исаев","999999");
        spravochnik.get("Гаджиев");
        spravochnik.get("Худоян");
        spravochnik.get("Исаев");
    }
}