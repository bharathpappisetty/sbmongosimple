package my.group.expjt.service;

import my.group.expjt.model.User;
import my.group.expjt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }


    public User findById(String id) {
        return userRepository.findById(id).orElse(new User());
    }


    public User save(User user) {
        return userRepository.save(user);
    }


    public User update(User superHero) {
        return userRepository.save(superHero);
    }


    public void delete(String id) {
        userRepository.findById(id).ifPresent(user -> userRepository.delete(user));
    }

}
