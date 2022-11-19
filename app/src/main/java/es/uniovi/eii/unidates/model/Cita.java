package es.uniovi.eii.unidates.model;

import java.util.Date;
import java.util.List;

public class Cita {
    private String id;
    private String descripcion;

    private Usuario proponente;
    private Usuario propuesto;

    private String localizacion;
    private Date fecha;

    private List<String> urlFotos;

    private double puntuacionProponente;
    private double puntuacionPropuesto;
}
