/**
* A classe Logger é um Singleton, então só pode existir uma instância dessa classe
*/
class Logger {
    private Logger() {}
  
    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void println(String msg) {
        System.out.println(msg);      
    }
}

class Main {  
    void f() {
        Logger log = Logger.getInstance();  
        log.println("Executando f " + log);
    }

    void g() {
        Logger log = Logger.getInstance();  
        log.println("Executando g " + log);
    }

    void h() {
        Logger log = Logger.getInstance();  
        log.println("Executando h " + log);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.f();
        m.g();
        m.h(); 
        System.out.println("As 3 chamadas executaram no mesmo objeto de ID: " + Logger.getInstance());
    }
}