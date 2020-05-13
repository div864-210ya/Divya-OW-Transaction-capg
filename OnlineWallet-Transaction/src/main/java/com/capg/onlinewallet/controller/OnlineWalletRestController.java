package com.capg.onlinewallet.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.onlinewallet.dao.OnlineWalletNotFoundException;
import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;
import com.capg.onlinewallet.service.IOnlineWalletService;

@RestController
@RequestMapping({ "/onlinewallet" })
//@CrossOrigin("http://localhost:4200")
public class OnlineWalletRestController {
	@Autowired
	private IOnlineWalletService service;

	
	 /* fund transfer meant for the transaction of amount from one id to another id */
	@PostMapping(path = "/fundtransfer")
	public ResponseEntity<TransferBean> deposit(@RequestBody TransferBean transferBean) throws Exception {
		OnlineWallet wallet = service.deposit(transferBean);

		if (wallet == null) {
			throw new Exception("Invalid id");
		}
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return new ResponseEntity<TransferBean>(transferBean, new HttpHeaders(), HttpStatus.OK);
	}
}
