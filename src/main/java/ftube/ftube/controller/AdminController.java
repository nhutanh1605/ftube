package ftube.ftube.controller;

import ftube.ftube.model.Authority;
import ftube.ftube.model.Role;
import ftube.ftube.model.User;
import ftube.ftube.service.IAuthorityService;
import ftube.ftube.service.IRoleService;
import ftube.ftube.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    IUserService iUserService;

    @Autowired
    IAuthorityService iAuthorityService;

    @Autowired
    IRoleService iRoleService;


    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return iUserService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> ListAllUser(){
        return iUserService.ListAllUser();
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable UUID id, @RequestBody User user) {
        return iUserService.updatedUser(id, user);
    }


    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable UUID id) {
        return iUserService.deleteUser(id);
    }

    @GetMapping("/bymajor/{major}")
    public List<User> findByMajor(@PathVariable String major) {
        return iUserService.findByMajor(major);
    }

//    @GetMapping("/bykeyword/{keyword}")
//    public List<User> findByKeyword(@PathVariable String keyword) {
//        return iUserService.findByKeyword(keyword);
//    }


    @GetMapping("/search")
    public List<User> findByKeyword(@RequestParam("keyword") String keyword) {
        List<User> result = iUserService.findByKeyword(keyword);
        return result;
    }


    @PostMapping("/authorities")
    public Authority createAuthority(@RequestBody Authority authority){
        return iAuthorityService.createAuthority(authority);
    }

    @GetMapping("/authorities")
    public List<Authority> ListAllAuthorities(){
        return iAuthorityService.ListAllAuthorities();
    }

    @PutMapping("/authorities/{id}")
    public Authority updateAuthority(@PathVariable UUID id, @RequestBody Authority authority) {
        return iAuthorityService.updatedAuthority(id, authority);
    }


    @DeleteMapping("/authorities/{id}")
    public boolean deleteAuthority(@PathVariable UUID id) {
        return iAuthorityService.deleteAuthority(id);
    }



    //comit

    @PostMapping("/role")
    public Role createRole(@RequestBody Role role){
        return iRoleService.createRole(role);
    }

    @GetMapping("/role")
    public List<Role> ListAllRole(){
        return iRoleService.ListAllRole();
    }

    @PutMapping("/role/{id}")
    public Role updateRole(@PathVariable UUID id, @RequestBody Role role) {
        return iRoleService.updatedRole(id, role);
    }


    @DeleteMapping("/role/{id}")
    public boolean deleteRole(@PathVariable UUID id) {
        return iRoleService.deleteRole(id);
    }
}
