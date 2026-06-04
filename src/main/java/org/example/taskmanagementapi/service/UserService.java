package org.example.taskmanagementapi.service;
import org.example.taskmanagementapi.entity.User;
import org.example.taskmanagementapi.exception.UserNotFoundException;
import org.example.taskmanagementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }
    public List<User> getAllUsers(){
        return repository.findAll();
    }
    public User getUserById(int id) {

        return repository.findById(id)

                .orElseThrow(() ->
                        new UserNotFoundException(
                                "User not found with id: " + id));
    }
    public User updateUser(int id, User updatedUser){
        updatedUser.setId(id);
        return repository.save(updatedUser);
    }
    public String deleteUser(int id){
        repository.deleteById(id);
        return "User deleted successfully";
    }
}

