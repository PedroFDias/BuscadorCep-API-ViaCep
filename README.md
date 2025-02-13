# 📦 Consulta de CEP com ViaCEP - Java

Este projeto é uma aplicação Java que permite consultar informações de um endereço a partir de um **CEP** fornecido pelo usuário. Utilizando a API gratuita [ViaCEP](https://viacep.com.br/), o programa faz uma requisição HTTP e retorna detalhes como **logradouro, bairro, cidade e estado**.

O objetivo do projeto é demonstrar o uso da API `ViaCEP` para consumir serviços web de forma simples e eficiente, além de mostrar boas práticas na manipulação de requisições HTTP em Java.

## 🚀 Tecnologias utilizadas
- **Java 11+**

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
Menu Operação:
```
********OPERAÇÕES********
0- Sair
1- Consultar CEP
Escolha uma das operações: 
*************************
```
Usuário insere um CEP:  
```
********OPERAÇÃO 1*******
Informe o cep: 01001000
*************************
```
Saída esperada:  
```
********RESULTADO********
CEP: 01001-000
Rua: Praça da Sé
Comp: lado ímpar
Bairro: Sé
Localidade: São Paulo
Estado: São Paulo
*************************
```

## 🛠 Tecnologias e principais classes utilizadas
- `HttpClient` → Para enviar requisições HTTP  
- `HttpRequest` → Para criar a requisição GET  
- `HttpResponse` → Para manipular a resposta da API  
- `URI` → Para definir a URL da API ViaCEP  
- `Gson` → Para criação de arquivo com dados da pesquisa

## 📜 Licença
Este projeto é de código aberto e está licenciado sob a **MIT License**.

