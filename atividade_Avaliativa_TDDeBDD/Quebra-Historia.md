## ✅ Passo 1 – Identificação da funcionalidade
Funcionalidade Central:
Permitir que o passageiro reserve um carro ao informar seu local atual.

Benefício:
Oferece uma forma prática e segura para o passageiro iniciar um deslocamento via aplicativo de transporte, com validação de área de cobertura.

## 🔍 Passo 2 – Verificação da estrutura padrão
História original:

**Como** passageiro de um aplicativo de transporte,
**Quero** reservar um carro informando meu local,
**Para** que eu possa me deslocar com comodidade e segurança.

#### ✅ Já está no formato recomendado.

## ✅ Passo 3 – Extração de critérios de aceitação (formato Gherkin)
 **Funcionalidade**: Reserva de carro com base na localização

  **Cenário**: Reserva dentro da área de cobertura
    Dado que o passageiro informa a cidade "Belo Horizonte" e o endereço "Rua A"
    Quando o passageiro solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Motorista a caminho"

  **Cenário**: Reserva dentro da área de cobertura (Contagem)
    Dado que o passageiro informa a cidade "Contagem" e o endereço "Rua B"
    Quando o passageiro solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Motorista a caminho"

  **Cenário**: Reserva fora da área de cobertura
    Dado que o passageiro informa a cidade "São Paulo" e o endereço "Rua C"
    Quando o passageiro solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Área fora de cobertura"

## 🔧 Passo 4 – Quebra técnica da história
Criar estrutura base do projeto Java (reserva_carro/)

Setup do projeto com pom.xml, estrutura de pacotes e dependências do Cucumber.

→ Categoria: Infraestrutura

Implementar a classe ReservaService com o método reservar(String cidade, String endereco)

Retornar "Motorista a caminho" para "Belo Horizonte" e "Contagem", senão "Área fora de cobertura".

→ Categoria: BackendBackend

Escrever testes unitários em ReservaServiceTest.java (TDD)

Criar testes de unidade para validar comportamento do método reservar.

→ Categoria:TestesTestículos

Criar arquivo reserva.feature com cenários em Gherkin

Incluir os cenários descritos acima para validação do comportamento do sistema.

→ Categoria: Testes (BDD)

Implementar ReservaSteps.javacom etapas de cenários BDD

Traduzir as etapas do Gherkin para código Java usando Cucumber.

→ Categoria: Testes (BDD)

Criar a classe ReservaRun.javapara executar os testes BDD

Runner para execução dos cenários usando JUnit e Cucumber.

→ Categoria: Testes

Documentar os casos de uso esperados no README.md ou na wiki do repositório

Explicar os cenários cobertos, estrutura do projeto e como executar testes.

→ Categoria: Documentação

