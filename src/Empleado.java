// Clase Empleado
public class Empleado {
    // Propiedades
    private String nombre;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método para calcular el salario base
    public double calcularSalario() {
        return salarioBase;
    }

    // Getters y setters (pueden ser generados automáticamente por tu IDE)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

// Clase Gerente
class Gerente extends Empleado {
    // Propiedad adicional
    private double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Método para calcular el salario total (sobreescrito)
    @Override
    public double calcularSalario() {
        // El salario total del gerente incluye el bono
        return super.calcularSalario() + bono;
    }

    // Getter y setter para el bono
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}

// Clase Desarrollador
class Desarrollador extends Empleado {
    // Propiedad adicional
    private double horasExtras;

    // Constructor
    public Desarrollador(String nombre, double salarioBase, double horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    // Método para calcular el salario total (sobreescrito)
    @Override
    public double calcularSalario() {
        // El salario total del desarrollador incluye las horas extras
        return super.calcularSalario() + horasExtras;
    }

    // Getter y setter para las horas extras
    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
}

// Clase Main
class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases Empleado, Gerente y Desarrollador
        Empleado empleado = new Empleado("Juan", 2000.0);
        Gerente gerente = new Gerente("Ana", 3000.0, 1000.0);
        Desarrollador desarrollador = new Desarrollador("Carlos", 2500.0, 5.0);

        // Mostrar información y calcular salarios
        System.out.println("Empleado: " + empleado.getNombre() + ", Salario: $" + empleado.calcularSalario());
        System.out.println("Gerente: " + gerente.getNombre() + ", Salario: $" + gerente.calcularSalario());
        System.out.println("Desarrollador: " + desarrollador.getNombre() + ", Salario: $" + desarrollador.calcularSalario());
    }
}
