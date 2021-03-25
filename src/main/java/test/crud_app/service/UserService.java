package test.crud_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.crud_app.model.User;
import test.crud_app.repository.UserRepository;
import java.util.List;


@Service
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
       return userRepository.getOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void saveUserI(User user){
        userRepository.save(user);
    }

    public void deleteById(Long id){
         userRepository.deleteById(id);
    }
}
