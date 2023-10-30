package ftube.ftube.service;

import ftube.ftube.model.User;
import ftube.ftube.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        if(user != null){
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public List<User> ListAllUser() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(UUID id) {
        User user = userRepository.getById(id);
            if(user != null){
                userRepository.delete(user);
                return true;
            }
        return false;
    }

    @Override
    public User updatedUser(UUID id, User user) {
        if(user!=null){
            User user1 = userRepository.getById(id);
            if(user1!=null){
                user1.setUsername(user.getUsername());
                user1.setPassword(user.getPassword());
                user1.setFullname(user.getFullname());
                user1.setEmail(user.getEmail());
                user1.setMssv(user.getMssv());
                user1.setMajor(user.getMajor());
                user1.setAvatar(user.getAvatar());


                return userRepository.save(user1);
            }
        }
        return null;
    }

    @Override
    public List<User> findByMajor(String major) {
        return userRepository.findByMajor(major);
    }

    @Override
    public List<User> findByKeyword(String keyword) {
        return userRepository.findByKeyword(keyword);
    }
}
