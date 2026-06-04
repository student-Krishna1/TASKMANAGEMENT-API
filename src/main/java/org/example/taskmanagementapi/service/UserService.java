package org.example.taskmanagementapi.service;
import org.example.taskmanagementapi.entity.User;
import org.example.taskmanagementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
    public User getUserById(int id){
        Optional<User> user=repository.findById(id);
        return user.orElse(null);
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

