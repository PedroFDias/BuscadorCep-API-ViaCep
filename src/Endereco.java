public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String estado) {

    @Override
    public String toString(){
        return """
                
                ********RESULTADO********
                CEP: %s
                Rua: %s
                Comp: %s
                Bairro: %s
                Localidade: %s
                Estado: %s
                """ .formatted(this.cep, this.logradouro, this.complemento, this.bairro, this.localidade, this.estado);
    }
}
