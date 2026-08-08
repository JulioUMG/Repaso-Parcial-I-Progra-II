package com.repasob.Service;

import com.repasob.Dto.LibroDto;
import com.repasob.Entity.Libro;
import com.repasob.Repository.LibroRepository;
import java.util.List;
import org.springframework.stereotype.Service;

//!LA CLASE SERVICIOS CONTIENE LA LÓGICA DE NEGOCIO PARA LA ENTIDAD Libro 

// servicio para la entidad Libro
@Service
// clase de servicio que contiene la lógica de negocio para la entidad Libro
public class LibroService {

    // inyección de dependencia del repositorio de libros
    private final LibroRepository libroRepository;

    // constructor para inicializar el repositorio de libros
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // método para crear un nuevo libro
    public Libro crear(LibroDto libroDto) {
        Libro libro = new Libro();
        libro.setTitulo66(libroDto.getTitulo66());
        libro.setAutor66(libroDto.getAutor66());
        libro.setIsbn66(libroDto.getIsbn66());
        libro.setEditorial66(libroDto.getEditorial66());
        libro.setEstado66(true);// establece el estado del libro como activo al crearlo
        return libroRepository.save(libro);
    }

    // método para mostrar todos los libros
    public List<Libro> mostrarTodos() {
        return libroRepository.findAll();
    }

    // método para buscar un libro por su ID
    public Libro buscarPorId(Integer id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    // método para modificar un libro existente
    public Libro modificar(Integer id, LibroDto libroDto) {
        Libro libro = buscarPorId(id);
        libro.setTitulo66(libroDto.getTitulo66());
        libro.setAutor66(libroDto.getAutor66());
        libro.setIsbn66(libroDto.getIsbn66());
        libro.setEditorial66(libroDto.getEditorial66());
        return libroRepository.save(libro);
    }

    // método para anular un libro existente
    public Libro anular(Integer id) {
        Libro libro = buscarPorId(id);
        libro.setEstado66(false);
        return libroRepository.save(libro);
    }

    // método para eliminar un libro existente
    public void eliminar(Integer id) {
        if (!libroRepository.existsById(id)) {
            throw new RuntimeException("Libro no encontrado");
        }
        libroRepository.deleteById(id);
    }

    // método para activar un libro existente
    public Libro activar(Integer id) {
        Libro libro = buscarPorId(id);
        libro.setEstado66(true);
        return libroRepository.save(libro);
    }
}