import Model.Aluguel;
import Model.Caminhao;
import Model.Carro;
import Model.Moto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControleAluguel {
    public static void main(String[] args) throws InterruptedException {
        Carro carro = new Carro();
        carro.setPlaca("HEL6666");
        carro.setMarca("Peugeot");
        carro.setModelo("208");
        carro.setAno(2024);
        carro.setNumeroPortas(4);

        Moto moto = new Moto();
        moto.setPlaca("FAZ9876");
        moto.setMarca("Fazer");
        moto.setModelo("Fz/25");
        moto.setAno(2024);
        moto.setCilindrada(250);

        Caminhao caminhao = new Caminhao();
        caminhao.setPlaca("DEF5678");
        caminhao.setMarca("Ford");
        caminhao.setModelo("Cargo");
        caminhao.setAno(2024);
        caminhao.setCapacidadeCarga(50.8);

        Aluguel aluguelCarro = new Aluguel();
        aluguelCarro.setVeiculo(carro);
        aluguelCarro.setDataAluguel(LocalDate.now());
        aluguelCarro.setHoraAluguel(LocalDateTime.now());

        Thread.sleep(1000);

        aluguelCarro.setHoraDevolucao(aluguelCarro.getHoraAluguel().plusHours(4));
        aluguelCarro.apresentarRegistroAluguel();

        Aluguel aluguelMoto = new Aluguel();
        aluguelMoto.setVeiculo(moto);
        aluguelMoto.setDataAluguel(LocalDate.now());
        aluguelMoto.setHoraAluguel(LocalDateTime.now());

        Thread.sleep(1000);

        aluguelMoto.setHoraDevolucao(aluguelMoto.getHoraAluguel().plusHours(15));
        aluguelMoto.apresentarRegistroAluguel();

        Aluguel aluguelCaminhao = new Aluguel();
        aluguelCaminhao.setVeiculo(caminhao);
        aluguelCaminhao.setDataAluguel(LocalDate.now());
        aluguelCaminhao.setHoraAluguel(LocalDateTime.now());

        Thread.sleep(1000);

        aluguelCaminhao.setHoraDevolucao(aluguelCaminhao.getHoraAluguel().plusHours(8));
        aluguelCaminhao.apresentarRegistroAluguel();
    }
}
