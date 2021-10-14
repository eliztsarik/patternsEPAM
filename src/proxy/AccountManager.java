package proxy;

public class AccountManager {
    private AccountService service;


    public AccountManager(AccountService service) {
        this.service = service;
    }

    public Account getAccount(long id) {
        return service.getById(id);
    }
}
