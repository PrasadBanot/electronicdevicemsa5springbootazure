package com.eletronicdeviceMSA5.SpringAzureElectronic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eletronicdeviceMSA5.SpringAzureElectronic.Repository.ElectronicRepository;
import com.eletronicdeviceMSA5.SpringAzureElectronic.model.ElectronicDevice;

@RestController
public class ElectronicDeviceController {
	@Autowired
	ElectronicRepository electronicRepository;
	
	@PostMapping("/multipleelectronicSave")
	public String insertElectronic(@RequestBody List<ElectronicDevice> electronic) {
		electronicRepository.saveAll(electronic);
		return "your record saved sucessfully";
	}

}
