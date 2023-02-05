package az.expressbank.liststocks.repository;


import az.expressbank.liststocks.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
