package universidad;

public abstract class Persona {
    String Nombre;
    int ID;
    String Correo;

    public Persona(String Nombre, int ID, String Correo) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Correo = Correo;
    }

    public Persona() {
        this.Nombre = "";
        this.ID = 0;
        this.Correo = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}