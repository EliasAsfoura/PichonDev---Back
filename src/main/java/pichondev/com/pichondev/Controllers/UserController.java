package pichondev.com.pichondev.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pichondev.com.pichondev.Models.UserModel;
import pichondev.com.pichondev.Services.UserService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    UserService usarioService;

    @GetMapping()
    public ArrayList<UserModel> obtenerUsuarios() {
        return usarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UserModel guardarUsuario(@RequestBody UserModel usuario) {
        return this.usarioService.guardarUsuario(usuario);
    }


    @GetMapping(path = "/{id}")
    public Optional<UserModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad")Integer priority) {
        return this.usarioService.obtenerPorPrioridad(priority);
    }

    @DeleteMapping ( path = "/{id}")
    public String eliminarPorId(@PathVariable("id")Long id) {
        boolean ok = this.usarioService.eliminarUsuario(id);
        if (ok) {
            return "Se eliminio el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }


}
