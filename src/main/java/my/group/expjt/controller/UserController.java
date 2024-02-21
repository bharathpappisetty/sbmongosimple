package my.group.expjt.controller;

import my.group.expjt.model.User;
import my.group.expjt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
    @PutMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        userService.delete(id);
        return "Deleted User with Id: "+ id;
    }
}
