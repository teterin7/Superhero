class Simbo extends Hero implements Superheroe {
   public String name;
   public String nameHero;
   public int edadHero;
   public int numeroSuerte;
   public long idHero;
   public String ciudadHero;
    private int ataque;
   public int nuevaSaludObjetivo;
   public Hero objetivo;

   public Simbo(int salud, int energia) {
      super(salud, energia);
   }

   public Simbo(String name, String nameHero, int edadHero, int numeroSuerte, long idHero, String ciudadHero, boolean visionLaser, boolean saltoextremo, boolean hadouken,int ataque) {

      this.name = name;
      this.nameHero = nameHero;
      this.edadHero = edadHero;
      this.numeroSuerte = numeroSuerte;
      this.idHero = idHero;
      this.ciudadHero = ciudadHero;
      this.ataque= ataque;

   }

   @Override
   public int getEnergia() {
      return super.getEnergia();
   }

   @Override
   public void setEnergia(int energia) {
      super.setEnergia(energia);
   }

   @Override
   public int getSalud() {
      return super.getSalud();
   }

   @Override
   public void setSalud(int salud) {
      super.setSalud(salud);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getNameHero() {
      return nameHero;
   }

   public void setNameHero(String nameHero) {
      this.nameHero = nameHero;
   }

   public int getEdadHero() {
      return edadHero;
   }

   public void setEdadHero(int edadHero) {
      this.edadHero = edadHero;
   }

   public int getNumeroSuerte() {
      return numeroSuerte;
   }

   public void setNumeroSuerte(int numeroSuerte) {
      this.numeroSuerte = numeroSuerte;
   }

   public long getIdHero() {
      return idHero;
   }

   public void setIdHero(long idHero) {
      this.idHero = idHero;
   }

   public String getCiudadHero() {
      return ciudadHero;
   }

   public void setCiudadHero(String ciudadHero) {
      this.ciudadHero = ciudadHero;
   }
   public int getAtaque() {
      return ataque;
   }

   public void setAtaque(int ataque) {
      this.ataque = ataque;
   }


   public void usarSuperpoder(int nuevaSaludObjetivo) {
      int nuevaSalud = getSalud() -10;
      setSalud(nuevaSalud);
   }
   public void atacar(Hero objetivo){
      this.objetivo = objetivo;
      int nuevaEnergia = getEnergia()-5;
      setEnergia(nuevaEnergia);
   }


}

