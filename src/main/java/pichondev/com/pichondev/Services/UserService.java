package pichondev.com.pichondev.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pichondev.com.pichondev.Models.UserModel;
import pichondev.com.pichondev.Repositories.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtenerUsuarios() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel guardarUsuario(UserModel usuario) {
        return userRepository.save(usuario);
    }



    public Optional<UserModel> obtenerPorId(Long id) {
        return userRepository.findById(id);
    }

    public ArrayList<UserModel> obtenerPorPrioridad(Integer priority) {
        return userRepository.findByPriority(priority);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }

}
