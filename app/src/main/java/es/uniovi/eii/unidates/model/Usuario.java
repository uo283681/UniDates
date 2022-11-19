package es.uniovi.eii.unidates.model;

import java.util.Date;
import java.util.List;

public class Usuario {
    private String uo;
    private String nombre;
    private String apellidos;
    private String ciudad;
    private String grado;
    private Date fecha_nacimiento;
    private String urlFotoPerfil;
    private List<String> fotos;

    private double puntuacion;

    private List<Solicitud> solicitudesRecibidas;
    private List<Solicitud> solicitudesEnviadas;
}
