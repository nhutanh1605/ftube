package ftube.ftube.service;

import ftube.ftube.model.Role;


import java.util.List;
import java.util.UUID;

public interface IRoleService {

    public Role createRole (Role role);

    public List<Role> ListAllRole();

    public boolean deleteRole(UUID id);

    public Role updatedRole(UUID id, Role role);



}
