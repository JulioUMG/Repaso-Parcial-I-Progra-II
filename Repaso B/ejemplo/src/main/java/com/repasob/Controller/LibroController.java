package com.repasob.Controller;

import com.repasob.Dto.LibroDto;
import com.repasob.Entity.Libro;
import com.repasob.Service.LibroService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//! CLASE DE CONTROLADOR MANEJA LAS PETICIONES HTTP PARA LA ENTIDAD Libro

//rest controller para la entidad Libro
@RestController
// ruta base para las operaciones de libros
@RequestMapping("/libros")
public class LibroController {

    // inyección de dependencia del servicio de libros
    private final LibroService libroService;

    // constructor para inicializar el servicio de libros
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // método para crear un nuevo libro
    @PostMapping
    public ResponseEntity<Libro> crear(
            @RequestBody LibroDto libroDto) {

        Libro libroCreado = libroService.crear(libroDto);

        return ResponseEntity.ok(libroCreado);
    }

    // método para mostrar todos los libros
    @GetMapping
    public ResponseEntity<List<Libro>> mostrarTodos() {
        List<Libro> libros = libroService.mostrarTodos();
        return ResponseEntity.ok(libros);
    }

    // método para buscar un libro por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Libro> buscarPorId(
            @PathVariable Integer id) {
        return ResponseEntity.ok(
                libroService.buscarPorId(id));
    }

    // método para modificar un libro existente
    @PutMapping("/{id}")
    public ResponseEntity<Libro> modificar(
            @PathVariable Integer id,
            @RequestBody LibroDto libroDto) {
        return ResponseEntity.ok(
                libroService.modificar(id, libroDto));
    }

    // método para anular un libro existente
    @PatchMapping("/{id}/anular")
    public ResponseEntity<Libro> anular(
            @PathVariable Integer id) {
        return ResponseEntity.ok(
                libroService.anular(id));
    }

    // método para eliminar un libro existente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(
            @PathVariable Integer id) {
        libroService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    // metodo para activar un libro existente
    @PatchMapping("/{id}/activar")
    public ResponseEntity<Libro> activar(
            @PathVariable Integer id) {
        return ResponseEntity.ok(
                libroService.activar(id));
    }
}