import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private WorkerLevel level;
    private Double salarioBase;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Trabalhador(String nome, WorkerLevel level, double salarioBase, Department department) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.department = department;
    }

    public Trabalhador() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int month, int year) {
        double soma = salarioBase;
        for (HourContract contract : contracts) {
            int c_month = contract.getDate().getMonthValue();
            int c_year = contract.getDate().getYear();

            if (year == c_year && month == c_month) {
                soma += contract.TotalValue();
            }
        }
        return soma;
    }

    public Department getDepartment() {
        return department;
    }
}
