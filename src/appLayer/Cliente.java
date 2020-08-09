package appLayer;

public class Cliente {

    private String nombreDelPerro = "";
    private String cedulaCliente = "";
    private String razaDelPerro = "";
    private boolean poseeAlergias = false;
    private String descripcionAlergias = "";
    private String fechaUltimoCorte ="";
    private String direccionCliente = "";
    private boolean requiereTransporte = false;


    public Cliente (String nombreDelPerro, String cedulaCliente, boolean requiereTransporte, String fechaUltimoCorte){
        this.nombreDelPerro = nombreDelPerro;
        this.cedulaCliente = cedulaCliente;
        this.requiereTransporte = requiereTransporte;
        this.fechaUltimoCorte = fechaUltimoCorte;
    }

    public String getNombreDelPerro() {
        return nombreDelPerro;
    }

    public void setNombreDelPerro(String nombreDelPerro) {
        this.nombreDelPerro = nombreDelPerro;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getRazaDelPerro() {
        return razaDelPerro;
    }

    public void setRazaDelPerro(String razaDelPerro) {
        this.razaDelPerro = razaDelPerro;
    }

    public boolean isPoseeAlergias() {
        return poseeAlergias;
    }

    public void setPoseeAlergias(boolean poseeAlergias) {
        this.poseeAlergias = poseeAlergias;
    }

    public String getDescripcionAlergias() {
        return descripcionAlergias;
    }

    public void setDescripcionAlergias(String descripcionAlergias) {
        this.descripcionAlergias = descripcionAlergias;
    }

    public String getFechaUltimoCorte() {
        return fechaUltimoCorte;
    }

    public void setFechaUltimoCorte(String fechaUltimoCorte) {
        this.fechaUltimoCorte = fechaUltimoCorte;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public boolean isRequiereTransporte() {
        return requiereTransporte;
    }

    public void setRequiereTransporte(boolean requiereTransporte) {
        this.requiereTransporte = requiereTransporte;
    }
}
