package io.github.azizgasimov94.payday.liststocks.repository;


import io.github.azizgasimov94.payday.liststocks.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
