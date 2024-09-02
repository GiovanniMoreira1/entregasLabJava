package org.example;
import java.util.Scanner;
import java.util.ArrayList;

/* @author Giovanni Moreira */

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaDeCarros = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            Carro carro = new Carro();
            System.out.println("---------------------------------");
            Carro.Marca marca = new Carro.Marca();
            System.out.println("Carro " + i);
            System.out.print("Marca: ");
            marca.setMarcaCarro(input.nextLine());
            System.out.print("Modelo: ");
            marca.setModeloCarro(input.nextLine());
            carro.setMarca(marca);

            Carro.Versao versao = new Carro.Versao();
            System.out.print("Ano do carro: ");
            versao.setAno(input.nextInt());
            input.nextLine();
            System.out.print("Qual versão: ");
            versao.setVersao(input.nextLine());
            carro.setVersao(versao);

            Carro.Cor cor = new Carro.Cor();
            System.out.print("Cor externa: ");
            cor.setCorExterna(input.nextLine());
            System.out.print("Cor interna: ");
            cor.setCorInterna(input.nextLine());
            carro.setCor(cor);

            Carro.Motor motor = new Carro.Motor();
            System.out.print("HP: ");
            motor.setHp(input.nextInt());
            input.nextLine();
            System.out.print("Quantidade de cilindros: ");
            motor.setCilindros(input.nextInt());
            input.nextLine();
            carro.setMotor(motor);

            Carro.Freio freio = new Carro.Freio();
            System.out.print("Tipo do freio: ");
            freio.setTipoFreio(input.nextLine());
            System.out.print("Durabilidade do freio: ");
            freio.setDurabilidade(input.nextInt());
            input.nextLine();
            carro.setFreio(freio);

            Carro.Banco banco = new Carro.Banco();
            System.out.print("Quantidade de lugares: ");
            banco.setQntdBancos(input.nextInt());
            input.nextLine();
            System.out.print("Material dos bancos: ");
            banco.setMaterial(input.nextLine());
            carro.setBanco(banco);

            Carro.Combustivel combustivel = new Carro.Combustivel();
            System.out.print("Tipo de combustível: ");
            combustivel.setTipoCombustivel(input.nextLine());
            System.out.print("Eficiência (km/l): ");
            combustivel.setConsumo(input.nextInt());
            input.nextLine();
            carro.setCombustivel(combustivel);

            Carro.Cambio cambio = new Carro.Cambio();
            System.out.print("Tipo do câmbio (manual/automático/outro): ");
            cambio.setTipoCambio(input.nextLine());
            System.out.print("Modelo do câmbio (cvt/dualogic/outro): ");
            cambio.setModeloCambio(input.nextLine());
            carro.setCambio(cambio);

            System.out.print("Tipo da roda (liga leve/aço/outro): ");
            String tipoRoda = input.nextLine();
            for (int j = 0; j < 4; j++) {
                Carro.Roda roda = new Carro.Roda();
                roda.setQntdRodas(1);
                roda.setTipoRoda(tipoRoda);
                carro.adicionarRoda(roda);
            }
            System.out.print("Quantas portas: ");
            int qntdPortas = input.nextInt();
            input.nextLine();
            System.out.print("Vidro elétrico ou manual: ");
            String vidro = input.nextLine();
            for (int h = 0; h < qntdPortas; h++) {
                Carro.Porta porta = new Carro.Porta();
                porta.setQntdPortas(1);
                porta.setTipoVidro(vidro);
                carro.adicionarPorta(porta);
            }

            listaDeCarros.add(carro);
        }

        System.out.println("-------------------------------------------------------");
        for (Carro carro : listaDeCarros) {
            System.out.println(carro.getMarca().getMarcaCarro() + " " + carro.getMarca().getModeloCarro() + " " +
            carro.getVersao().getVersao() + " " + carro.getVersao().getAno());
            System.out.println("A cor externa é " + carro.getCor().getCorExterna() + " e a cor interna é " +
            carro.getCor().getCorInterna());
            System.out.println("O motor possui " + carro.getMotor().getCilindros() + " cilindros e " +
            carro.getMotor().getHp() + " cavalos");
            System.out.println("Freio: " + carro.getFreio().getTipoFreio() + " com durabilidade de " +
            carro.getFreio().getDurabilidade() + " KMs");
            System.out.println(carro.getBanco().getQntdBancos() + " lugares, com bancos feitos de " + carro.getBanco().getMaterial());
            System.out.println("O combustível mais usado é o(a) " + carro.getCombustivel().getTipoCombustivel()
            + " com uma eficiência de " + carro.getCombustivel().getConsumo() + " Km/L");
            System.out.println("O carro possui " + carro.getPortas().size() + " portas com vidro " + carro.getPortas().getFirst().getTipoVidro());
            System.out.println("Câmbio " + carro.getCambio().getTipoCambio() + " do modelo " +
            carro.getCambio().getModeloCambio());
            System.out.println("Além disso, o veículo possui " + carro.getRodas().size() + " rodas de "
            + carro.getRodas().getFirst().getTipoRoda());
            System.out.println("-------------------------------------------------------");

        }

    }
}
