package logicaNegocio;

public class Perro extends Animal implements Domestico{

    private TipoHabitat Habitat;

    public Perro() {
        this.Habitat = Habitat.TERRESTRE;

    }

    public TipoHabitat getHabitat() {
        return Habitat;
    }
    
    

    @Override
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }

    @Override
    public String emitirSonido() {
        return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "Omnívoro";
    }
}
