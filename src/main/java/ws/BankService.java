package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

// POJO
@WebService(serviceName = "BankWS")
public class BankService {
    @WebMethod(operationName = "conversionEuroToMAD")
    public double conversion(@WebParam(name= "amount") double amount) {
        return amount * 10.47;
    }

    @WebMethod
    public Account getAccount(@WebParam(name= "code") int code) {
        return new Account(code, 100 + Math.random() * 900, new Date());
    }

    @WebMethod
    public List<Account> getAccounts() {
        return List.of(
                new Account(1, 100 + Math.random() * 900, new Date()),
                new Account(2, 100 + Math.random() * 900, new Date()),
                new Account(3, 100 + Math.random() * 900, new Date())
        );
    }
}
