package kr.hs.dgsw.web_01_408.Service;

import kr.hs.dgsw.web_01_408.Domain.User;

import java.util.List;

public interface UserService {
    List<User> listAllUser();
    User findUser(Long id);
    User addUser(User user);
    User modifyUser(Long id, User user);
    String findfilePath(Long id);
    String findfileName(String path);
    boolean deleteUser(Long id);
}