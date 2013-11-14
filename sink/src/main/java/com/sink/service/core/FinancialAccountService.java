package com.sink.service.core;

public interface FinancialAccountService {
    public List<FinancialAccount> findAllAccounts();
    public List<FinancialAccount> searchAccount(String keyword);

    public int addAccount(FinancialAccount account);
    public void activateAccount(int id);
    public void deactivateAccount(int id);
    public void saveOrUpdateAccount(FinancialAccount account);
    
}
