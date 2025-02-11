# 📦 Consulta de CEP com ViaCEP - Java

Este projeto é uma aplicação Java que permite consultar informações de um endereço a partir de um **CEP** fornecido pelo usuário. Utilizando a API gratuita [ViaCEP](https://viacep.com.br/), o programa faz uma requisição HTTP e retorna detalhes como **logradouro, bairro, cidade e estado**.

O objetivo do projeto é demonstrar o uso da API `java.net.http` para consumir serviços web de forma simples e eficiente, além de mostrar boas práticas na manipulação de requisições HTTP em Java.

## 🚀 Tecnologias utilizadas
- **Java 11+** (utilizando a API `java.net.http`)

## 📌 Funcionalidades
✅ Consulta de endereço a partir de um **CEP válido**  
✅ Retorno de informações detalhadas do endereço  
✅ Tratamento de erros para **CEPs inválidos ou inexistentes**  
✅ Estrutura simples e fácil de entender  

## 🔧 Como executar
1. **Clone este repositório:**  
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/PedroFDias/BuscadorCep-API-ViaCep.git)
   ```  
2. **Abra o projeto** em sua IDE favorita (**IntelliJ, Eclipse, VS Code etc.**)  
3. **Verifique se tem Java 11 ou superior instalado**  
4. **Compile e execute o programa**  

## 📖 Exemplo de uso
Usuário insere um CEP:  
```
Digite o CEP: 30130-010
```
Saída esperada:  
```
Logradouro: Praça Sete de Setembro
Bairro: Centro
Cidade: Belo Horizonte
Estado: MG
```

## 🛠 Tecnologias e principais classes utilizadas
- `HttpClient` → Para enviar requisições HTTP  
- `HttpRequest` → Para criar a requisição GET  
- `HttpResponse` → Para manipular a resposta da API  
- `URI` → Para definir a URL da API ViaCEP  

## 📜 Licença
Este projeto é de código aberto e está licenciado sob a **MIT License**.

