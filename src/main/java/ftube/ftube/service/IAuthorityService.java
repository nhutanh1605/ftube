package ftube.ftube.service;

import ftube.ftube.model.Authority;
import ftube.ftube.model.User;

import java.util.List;
import java.util.UUID;

public interface IAuthorityService {

    public Authority createAuthority (Authority authority);

    public List<Authority> ListAllAuthorities();

    public boolean deleteAuthority(UUID id);

    public Authority updatedAuthority(UUID id, Authority authority);
}
