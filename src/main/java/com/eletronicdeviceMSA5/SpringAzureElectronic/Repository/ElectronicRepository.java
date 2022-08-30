package com.eletronicdeviceMSA5.SpringAzureElectronic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronicdeviceMSA5.SpringAzureElectronic.model.ElectronicDevice;

public interface ElectronicRepository extends JpaRepository<ElectronicDevice, Long> {

}
