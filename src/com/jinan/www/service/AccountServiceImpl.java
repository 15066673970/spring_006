package com.jinan.www.service;

import com.jinan.www.dao.AccountDao;

public class AccountServiceImpl implements AccountService {

	private AccountDao ad;
	
	@Override
	public void transfer(Integer from, Integer to, Double money) {
		// TODO Auto-generated method stub
		//¼õÇ®
		ad.decreaseMoney(from, money);
	
		//Ä£ÄâÒì³£
//		int i=1/0;
		
		//¼ÓÇ®
		ad.increaseMoney(to, money);
	}

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	
	

}
