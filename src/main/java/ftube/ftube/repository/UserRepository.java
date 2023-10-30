package ftube.ftube.repository;

import ftube.ftube.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {


    List<User> findByMajor(String major);

    @Query("SELECT u FROM User u WHERE u.username LIKE %:keyword%  OR u.mssv LIKE %:keyword% OR u.email LIKE %:keyword% OR u.fullname LIKE %:keyword% OR u.major LIKE %:keyword%")
    List<User> findByKeyword(@Param("keyword") String keyword);
}
