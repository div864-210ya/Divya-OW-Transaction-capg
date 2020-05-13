package com.capg.onlinewallet.dao;
import java.util.List;

import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;

public interface IOnlineWalletDao {
	
	/*OnlineWallet CreateEmployee(OnlineWallet emp);
	OnlineWallet findEmployeeById(long empId);
	OnlineWallet updateEmployee(OnlineWallet emp); 
	List<OnlineWallet> findAllEmployees();
	void deleteEmployee(long empId);
}
*/
	
	public OnlineWallet deposit(TransferBean transferBean); 
}
