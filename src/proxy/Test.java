package proxy;

public class Test {
    public static void main(String[] args) {

        AccountManager proxyManager = new AccountManager(new AccountServiceProxy());
        AccountManager nativeManager = new AccountManager(new AccountServiceImpl());

        System.out.println("----------");
        System.out.println("With proxy: ");
        var proxyResult = proxyManager.getAccount(1);
        System.out.println(proxyResult);


        System.out.println("----------");
        System.out.println("Without Proxy:");
        var nativeResult = nativeManager.getAccount(12);
        System.out.println(nativeResult);
    }
}
