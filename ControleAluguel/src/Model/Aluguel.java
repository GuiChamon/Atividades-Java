package Model;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
    private int idAluguel;
    private Veiculo veiculo;
    private LocalDate dataAluguel;
    private LocalDateTime horaAluguel;
    private LocalDateTime horaDevolucao;

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getHoraAluguel() {
        return horaAluguel;
    }

    public void setHoraAluguel(LocalDateTime horaAluguel) {
        this.horaAluguel = horaAluguel;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public void apresentarRegistroAluguel() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Veículo alugado: " + veiculo.getClass().getSimpleName());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Data de Aluguel: " + dataAluguel.format(dateFormatter));
        System.out.println("Hora de Retirada: " + horaAluguel.format(timeFormatter));

        System.out.println();

        if (horaDevolucao != null) {
            System.out.println("Veículo devolvido: " + veiculo.getClass().getSimpleName());
            System.out.println("Hora de Devolução: " + horaDevolucao.format(timeFormatter));
        }
        System.out.println();
    }
}