package com.repasob.Dto;

public class LibroDto {
    // Attributos
    private Integer idLibro66;
    private Boolean estado66;
    private String titulo66;
    private String autor66;
    private String isbn66;
    private String editorial66;

    // Getters and Setters
    public LibroDto() {
    }

    public LibroDto(Integer idLibro66, Boolean estado66, String titulo66, String autor66, String isbn66,
            String editorial66) {

        this.idLibro66 = idLibro66;
        this.estado66 = estado66;
        this.titulo66 = titulo66;
        this.autor66 = autor66;
        this.isbn66 = isbn66;
        this.editorial66 = editorial66;
    }

    public Integer getIdLibro66() {
        return idLibro66;
    }

    public void setIdLibro66(Integer idLibro66) {
        this.idLibro66 = idLibro66;
    }

    public Boolean getEstado66() {
        return estado66;
    }

    public void setEstado66(Boolean estado66) {
        this.estado66 = estado66;
    }

    public String getTitulo66() {
        return titulo66;
    }

    public void setTitulo66(String titulo66) {
        this.titulo66 = titulo66;
    }

    public String getAutor66() {
        return autor66;
    }

    public void setAutor66(String autor66) {
        this.autor66 = autor66;
    }

    public String getIsbn66() {
        return isbn66;
    }

    public void setIsbn66(String isbn66) {
        this.isbn66 = isbn66;
    }

    public String getEditorial66() {
        return editorial66;
    }

    public void setEditorial66(String editorial66) {
        this.editorial66 = editorial66;
    }
}