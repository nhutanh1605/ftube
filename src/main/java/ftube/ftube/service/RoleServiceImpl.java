package ftube.ftube.service;

import ftube.ftube.model.Role;
import ftube.ftube.model.User;
import ftube.ftube.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role createRole(Role role) {
        if(role != null){
            return roleRepository.save(role);
        }
        return null;
    }

    @Override
    public List<Role> ListAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public boolean deleteRole(UUID id) {
        Role role = roleRepository.getById(id);
        if(role != null){
            roleRepository.delete(role);
            return true;
        }
        return false;
    }

    @Override
    public Role updatedRole(UUID id, Role role) {
        if(role!=null){
            Role role1 = roleRepository.getById(id);
            if(role1!=null){
                role1.setName(role.getName());
                role1.setAuthorities(role.getAuthorities());


                return roleRepository.save(role1);
            }
        }
        return null;
    }
}
