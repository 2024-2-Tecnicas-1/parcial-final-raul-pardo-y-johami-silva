package logicaNegocio;

public class Leon extends Animal{

     TipoHabitat Habitat;
    public Leon() {
        this.Habitat = Habitat.TERRESTRE;
    }

    public TipoHabitat getHabitat() {
        return Habitat;
    }

   
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnivoro";
    }

    
    
}
