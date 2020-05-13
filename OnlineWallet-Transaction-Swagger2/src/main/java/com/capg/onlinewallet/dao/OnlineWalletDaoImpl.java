package com.capg.onlinewallet.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

//import com.capg.bank.entity.History;
//import com.capg.bank.entity.BankBean;
//import com.capg.bank.entity.History;
import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;

@Repository
@Transactional
public class OnlineWalletDaoImpl implements IOnlineWalletDao {

	@PersistenceContext
	private EntityManager entityManager;

	
	
	/*continues from the service layer and transfers the funds from one id to
	  another id which are existing*/
	 @Override
	public OnlineWallet deposit(TransferBean transferBean) {
		// TODO Auto-generated method stub
		OnlineWallet bean = entityManager.find(OnlineWallet.class, transferBean.getCustomerId1());
		bean.setAccountBalance(bean.getAccountBalance() - transferBean.getAmount());
		System.out.println(bean);
		entityManager.persist(bean);
		OnlineWallet bean1 = entityManager.find(OnlineWallet.class, transferBean.getCustomerId2());
		bean1.setAccountBalance(bean1.getAccountBalance() + transferBean.getAmount());
		System.out.println(bean1);
		entityManager.persist(bean1);

		return bean;
	}
    
}
