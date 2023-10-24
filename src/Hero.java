public class Hero {
    private int salud;

    private int energia;

    public Hero(int salud, int energia) {
        this.salud = salud;
        this.energia = energia;
    }

    public Hero() {
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
