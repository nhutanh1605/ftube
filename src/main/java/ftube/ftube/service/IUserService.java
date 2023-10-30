package ftube.ftube.service;

import ftube.ftube.model.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {

    public User createUser (User user);

    public List<User> ListAllUser();

    public boolean deleteUser(UUID id);

    public User updatedUser(UUID id, User user);

    List<User> findByMajor(String major);

    List<User> findByKeyword(String keyword);

}
