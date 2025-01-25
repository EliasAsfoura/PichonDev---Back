package pichondev.com.pichondev.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pichondev.com.pichondev.Models.UserModel;
import pichondev.com.pichondev.Services.UserService;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    public abstract ArrayList<UserModel> findByStatus(String status);

}
