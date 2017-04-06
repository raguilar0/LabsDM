package cr.ac.ucr.rav.sodauniversitaria;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ricardo Aguilar on 4/6/2017.
 */

public class Persona implements Parcelable {
    private String identificacion;
    private String correo;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String celular;

    protected Persona(Parcel in) {
        identificacion = in.readString();
        correo = in.readString();
        nombre = in.readString();
        primerApellido = in.readString();
        segundoApellido = in.readString();
        celular = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(identificacion);
        dest.writeString(correo);
        dest.writeString(nombre);
        dest.writeString(primerApellido);
        dest.writeString(segundoApellido);
        dest.writeString(celular);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    public Persona(String identificacion, String correo, String nombre, String primerApellido, String segundoApellido, String celular) {
        this.identificacion = identificacion;
        this.correo = correo;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celular = celular;
    }

    public Persona() {
        this.identificacion = "B10141";
        this.correo = "ricardoaguilarvargas@ucr.ac.cr";
        this.nombre = "Ricardo";
        this.primerApellido = "Aguilar";
        this.segundoApellido = "Vargas";
        this.celular = "87831738";
    }



    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }
}
