package com.capg.onlinewallet.service;
import java.util.List;

import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;

public interface IOnlineWalletService {

	public OnlineWallet deposit(TransferBean transferBean) ;


}
