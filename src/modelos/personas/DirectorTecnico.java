package modelos.personas;

public class DirectorTecnico extends Persona {

    private int FechaNomb;

    public DirectorTecnico(String nombre, int fechaNac, int FechaNomb ){
        super(nombre, fechaNac);
        this.FechaNomb = FechaNomb;
    }

    public int getFechaNomb() {
        return FechaNomb;
    }

    public void setFechaNomb(int fechaNomb) {
        FechaNomb = fechaNomb;
    }
}
