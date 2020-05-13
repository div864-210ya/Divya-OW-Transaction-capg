package com.capg.onlinewallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;
@RestController
@RequestMapping("/onlinewallet-ms")
public class TransactionOnlineWalletController {

	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/transaction")
	public TransferBean deposit(@RequestBody TransferBean transferBean)
	{
		return restTemplate.postForObject("http://localhost:8049/onlinewallet/fundtransfer",transferBean,TransferBean.class);
	}
}
