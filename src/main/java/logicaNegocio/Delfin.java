package logicaNegocio;

public class Delfin extends Animal{
    TipoHabitat Habitat;
    public Delfin() {
        this.Habitat = Habitat.ACUATICO;
    }

    public TipoHabitat getHabitat() {
        return Habitat;
    }
    
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
    
    
  
}
