package com.capg.onlinewallet.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.onlinewallet.entities.TransferBean;

import com.capg.onlinewallet.dao.IOnlineWalletDao;
import com.capg.onlinewallet.entities.OnlineWallet;

@Service

public class OnlineWalletServiceImpl implements IOnlineWalletService{
	@Autowired
	private IOnlineWalletDao dao;
	
    /* transfers the amount from one id to another through the deposit method*/
	@Override
	public OnlineWallet deposit(TransferBean transferBean) {
		// TODO Auto-generated method stub
		//return dao.fundTransfer(customerId1, customerId2, amount);
		return dao.deposit(transferBean);
	}
	
	
}
