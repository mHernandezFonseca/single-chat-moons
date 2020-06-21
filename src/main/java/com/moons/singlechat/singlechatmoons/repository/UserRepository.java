package com.moons.singlechat.singlechatmoons.repository;

import com.moons.singlechat.singlechatmoons.application.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by Miguel Fonseca on 20/06/2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
