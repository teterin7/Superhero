// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Simbo simbo= new Simbo(100,100);
        Hero otroHero = new Hero(150,80);


        simbo.atacar((otroHero));
        System.out.println("Salud del otro hero despues del ataque:"+otroHero.getSalud());
        System.out.println("Energia de simbo despues del ataque"+ simbo.getEnergia());

        simbo.usarSuperpoder(85 );
        System.out.println( "salud de simbo depues del super poder"+simbo.getSalud());
    }

}
