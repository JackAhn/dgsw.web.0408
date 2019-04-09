package kr.hs.dgsw.web_01_408.Controller;

import kr.hs.dgsw.web_01_408.Domain.User;
import kr.hs.dgsw.web_01_408.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userlist")
    public List<User> list(){
        return userService.listAllUser();
    }

    @GetMapping("/usersearch/{id}")
    public User find(@PathVariable Long id){
        return userService.findUser(id);
    }

    @GetMapping("/userPath/{id}")
    public String getFilePath(@PathVariable Long id){
        return this.userService.findfilePath(id);
    }

    @PostMapping("/useradd")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @PutMapping("/usermodify/{id}")
    public User modify(@RequestBody User user, @PathVariable Long id){
        if(find(id)!=null)
            return this.userService.modifyUser(id, user);
        else
            return null;
    }
    @DeleteMapping("/userdelete/{id}")
    public boolean delete(@PathVariable Long id){
        return this.userService.deleteUser(id);
    }
}