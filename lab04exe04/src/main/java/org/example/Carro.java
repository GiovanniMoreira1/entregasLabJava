package org.example;
import java.util.ArrayList;

/* @author Giovanni Moreira */

public class Carro {
    private Motor motor;
    private final ArrayList<Roda> rodas;
    private Banco banco;
    private Combustivel combustivel;
    private Freio freio;
    private final ArrayList<Porta> portas;
    private Versao versao;
    private Cor cor;
    private Marca marca;
    private Cambio cambio;

    public Motor getMotor() {
        return motor;
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void adicionarPorta(Porta porta) {
        this.portas.add(porta);
    }

    public ArrayList<Roda> getRodas() {
        return rodas;
    }
    public void adicionarRoda(Roda roda) {
        this.rodas.add(roda);
    }

    public Banco getBanco() {
        return banco;
    }
    public Cambio getCambio() {
        return cambio;
    }
    public Combustivel getCombustivel() {
        return combustivel;
    }
    public Cor getCor() {
        return cor;
    }
    public Freio getFreio() {
        return freio;
    }
    public Marca getMarca() {
        return marca;
    }
    public Versao getVersao() {
        return versao;
    }

    public void setVersao(Versao versao) {
        this.versao = versao;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }
    public void setFreio(Freio freio) {
        this.freio = freio;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Carro() {
        this.rodas = new ArrayList<>();
        this.portas = new ArrayList<>();
    }

    public static class Roda {
        private int qntdRodas;
        private String tipoRoda;    // liga leve, aço

        public String getTipoRoda() {
            return tipoRoda;
        }
        public void setQntdRodas(int qntdRodas) {
            this.qntdRodas = qntdRodas;
        }
        public void setTipoRoda(String tipoRoda) {
            this.tipoRoda = tipoRoda;
        }

    }

    public static class Motor {
        private int hp, cilindros;      // hp - cavalos

        public int getCilindros() {
            return cilindros;
        }
        public int getHp() {
            return hp;
        }
        public void setCilindros(int cilindros) {
            this.cilindros = cilindros;
        }
        public void setHp(int hp) {
            this.hp = hp;
        }
    }

    public static class Banco {
        private String material;
        private int qntdBancos;

        public int getQntdBancos() {
            return qntdBancos;
        }
        public String getMaterial() {
            return material;
        }
        public void setMaterial(String material) {
            this.material = material;
        }
        public void setQntdBancos(int qntdBancos) {
            this.qntdBancos = qntdBancos;
        }
    }

    public static class Combustivel {
        private String tipoCombustivel;
        private double consumo;     // km/l

        public double getConsumo() {
            return consumo;
        }
        public String getTipoCombustivel() {
            return tipoCombustivel;
        }
        public void setConsumo(double consumo) {
            this.consumo = consumo;
        }
        public void setTipoCombustivel(String tipoCombustivel) {
            this.tipoCombustivel = tipoCombustivel;
        }
    }

    public static class Freio {
        private String tipoFreio;     // abs, disco, etc
        private int durabilidade;     // em km

        public int getDurabilidade() {
            return durabilidade;
        }
        public String getTipoFreio() {
            return tipoFreio;
        }
        public void setTipoFreio(String tipoFreio) {
            this.tipoFreio = tipoFreio;
        }
        public void setDurabilidade(int durabilidade) {
            this.durabilidade = durabilidade;
        }
    }

    public static class Porta {
        private int qntdPortas;
        private String tipoVidro;   // eletrico, manual

        public String getTipoVidro() {
            return tipoVidro;
        }
        public void setQntdPortas(int qntdPortas) {
            this.qntdPortas = qntdPortas;
        }
        public void setTipoVidro(String tipoVidro) {
            this.tipoVidro = tipoVidro;
        }
    }

    public static class Versao {
        private String versao;          // gti, comfortline, etc
        private int ano;

        public int getAno() {
            return ano;
        }
        public String getVersao() {
            return versao;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
        public void setVersao(String versao) {
            this.versao = versao;
        }
    }

    public static class Cor {
        private String corExterna, corInterna;

        public String getCorExterna() {
            return corExterna;
        }
        public String getCorInterna() {
            return corInterna;
        }

        public void setCorExterna(String corExterna) {
            this.corExterna = corExterna;
        }
        public void setCorInterna(String corInterna) {
            this.corInterna = corInterna;
        }

    }

    public static class Marca {
        private String marcaCarro, modeloCarro;

        public String getMarcaCarro() {
            return marcaCarro;
        }
        public String getModeloCarro() {
            return modeloCarro;
        }

        public void setMarcaCarro(String marcaCarro) {
            this.marcaCarro = marcaCarro;
        }
        public void setModeloCarro(String modeloCarro) {
            this.modeloCarro = modeloCarro;
        }
    }

    public static class Cambio {
        private String tipoCambio, modeloCambio;   // tipo - manual/automatico/outro | modelo - cvt, dualogic etc

        public String getModeloCambio() {
            return modeloCambio;
        }
        public String getTipoCambio() {
            return tipoCambio;
        }

        public void setModeloCambio(String modeloCambio) {
            this.modeloCambio = modeloCambio;
        }
        public void setTipoCambio(String tipoCambio) {
            this.tipoCambio = tipoCambio;
        }
    }
}