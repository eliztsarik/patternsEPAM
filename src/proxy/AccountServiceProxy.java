package proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class AccountServiceProxy implements AccountService {
    private AccountServiceImpl service;
    private static Logger logger = Logger.getLogger(AccountServiceProxy.class.getName());


    public AccountServiceProxy() {
        this.service = new AccountServiceImpl();
    }

    @Override
    public Account getById(long id) {
        var todayInString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd 'в' HH:mm:ss"));
        logger.info(todayInString + " просмотрен аккаунт с id = " + id);
        return service.getById(id);
    }
}
