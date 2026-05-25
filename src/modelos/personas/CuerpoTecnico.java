package modelos.personas;

public class CuerpoTecnico extends Persona {
    Rol rol;
    public CuerpoTecnico(String nombre, int fechaNac, Rol rol){

        super(nombre, fechaNac);
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
