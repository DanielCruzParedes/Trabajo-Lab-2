public class PlanIphone extends Plan {
    private String email;
    
    public PlanIphone(String numerodecliente, String numerodetelefono, String email) {
        super(numerodecliente, numerodetelefono);
        this.email = email;
    }

    public PlanIphone(String numerodetelefono, String numerodecliente) {
        super(numerodetelefono, numerodecliente);
    }
    
    public double pagoMensual (int mins, int msgs){
        double Internet5G = 22.0;
        double costoMins = 0.4 * mins;
        double costoMsgs = 0.1 * msgs;
        return Internet5G + costoMins + costoMsgs;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Email: " + email);        
    }

    public String getEmail() {
        return email;
    }      
}