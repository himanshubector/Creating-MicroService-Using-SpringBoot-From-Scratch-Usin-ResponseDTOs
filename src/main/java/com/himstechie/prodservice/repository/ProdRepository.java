package com.himstechie.prodservice.repository;

import com.himstechie.prodservice.dto.ProdRequest;
import com.himstechie.prodservice.entity.Prod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepository extends JpaRepository<Prod, String>
{


}
