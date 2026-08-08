/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repasob.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author 10jul
 */
@Entity
@Table(name = "libro")
@NamedQueries({
        @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l"),
        @NamedQuery(name = "Libro.findByIdLibro66", query = "SELECT l FROM Libro l WHERE l.idLibro66 = :idLibro66"),
        @NamedQuery(name = "Libro.findByEstado66", query = "SELECT l FROM Libro l WHERE l.estado66 = :estado66"),
        @NamedQuery(name = "Libro.findByTitulo66", query = "SELECT l FROM Libro l WHERE l.titulo66 = :titulo66"),
        @NamedQuery(name = "Libro.findByAutor66", query = "SELECT l FROM Libro l WHERE l.autor66 = :autor66"),
        @NamedQuery(name = "Libro.findByIsbn66", query = "SELECT l FROM Libro l WHERE l.isbn66 = :isbn66"),
        @NamedQuery(name = "Libro.findByEditorial66", query = "SELECT l FROM Libro l WHERE l.editorial66 = :editorial66") })
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro_66")
    private Integer idLibro66;
    @Column(name = "estado_66")
    private Boolean estado66;
    @Basic(optional = true)
    @Column(name = "titulo_66")
    private String titulo66;
    @Basic(optional = false)
    @Column(name = "autor_66")
    private String autor66;
    @Basic(optional = false)
    @Column(name = "isbn_66")
    private String isbn66;
    @Basic(optional = false)
    @Column(name = "editorial_66")
    private String editorial66;

    public Libro() {
    }

    public Libro(Integer idLibro66) {
        this.idLibro66 = idLibro66;
    }

    public Libro(Integer idLibro66, String titulo66, String autor66, String isbn66, String editorial66) {
        this.idLibro66 = idLibro66;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibro66 != null ? idLibro66.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.idLibro66 == null && other.idLibro66 != null)
                || (this.idLibro66 != null && !this.idLibro66.equals(other.idLibro66))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.repasob.Entity.Libro[ idLibro66=" + idLibro66 + " ]";
    }

}
