# language: pt
# features/reserva.feature

Funcionalidade: Reserva de carro com base na localização do passageiro
  Como passageiro de um aplicativo de transporte
  Quero reservar um carro informando meu local
  Para que eu possa me deslocar com comodidade e segurança

  Cenário: Reserva dentro da área de cobertura (Belo Horizonte)
    Dado que o passageiro informa a cidade "Belo Horizonte" e o endereço "Rua A"
    Quando o passageiro solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Motorista a caminho"

  Cenário: Reserva dentro da área de cobertura (Contagem)
    Dado que o passageiro informa a cidade "Contagem" e o endereço "Rua B"
    Quando o passageiro solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que o passageiro informa a cidade "São Paulo" e o endereço "Rua C"
    Quando o passageiro solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Área fora de cobertura"

