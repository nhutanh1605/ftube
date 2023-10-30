package ftube.ftube.service;

import ftube.ftube.model.Authority;
import ftube.ftube.model.User;
import ftube.ftube.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AuthorityServiceImpl implements IAuthorityService{

    @Autowired
    AuthorityRepository authorityRepository;



    @Override
    public Authority createAuthority(Authority authority) {
        if(authority != null){
            return authorityRepository.save(authority);
        }
        return null;
    }

    @Override
    public List<Authority> ListAllAuthorities() {
        return authorityRepository.findAll();
    }

    @Override
    public boolean deleteAuthority(UUID id) {
        Authority authority = authorityRepository.getById(id);
        if(authority != null){
            authorityRepository.delete(authority);
            return true;
        }
        return false;
    }

    @Override
    public Authority updatedAuthority(UUID id, Authority authority) {
        if(authority!=null){
            Authority authority1 = authorityRepository.getById(id);
            if(authority1!=null){
                authority1.setRole(authority.getRole());
                authority1.setUser(authority.getUser());

                return authorityRepository.save(authority1);
            }
        }
        return null;
    }
}
