package it.unicas.progettoProva.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Antonio on 03/11/2017.
 */
public class Colleghi {

    private SimpleIntegerProperty id;
    private StringProperty nome;
    private StringProperty cognome;
    private StringProperty telefono;

    /**
     * Default costructor
     */
    public Colleghi(){this(null,null);}

    public Colleghi(String nome, String cognome, String telefono, Integer id){
        this.nome = new SimpleStringProperty(nome);
        this.cognome = new SimpleStringProperty(cognome);
        this.telefono = new SimpleStringProperty(telefono);
        this.id = new SimpleIntegerProperty(id);
    }

    /**
     * Costructor with some initial values
     */
    public Colleghi(String nome,String cognome){
        this.nome = new SimpleStringProperty(nome);
        this.cognome = new SimpleStringProperty(cognome);
        this.telefono = new SimpleStringProperty("telefono");
        this.id = null;
    }

    public Integer getId(){
        if(id==null)
            id = new SimpleIntegerProperty(-1);
        return id.get();
    }

    public void setId(Integer id){
        if(this.id == null)
            this.id = new SimpleIntegerProperty();
        this.id.set(id);
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNome() {
        return nome.get();
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getCognome() {
        return cognome.get();
    }

    public StringProperty cognomeProperty() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome.set(cognome);
    }

    public String getTelefono() {
        return telefono.get();
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }
}
