package com.ozlemkrblt.springEntityCase.Model;

import com.ozlemkrblt.springEntityCase.Model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Kullanici,Long> {
}

