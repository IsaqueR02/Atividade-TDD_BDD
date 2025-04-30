Funcionalidade: Reserva de Carro

  Cenário: Reserva dentro da área de cobertura
    Dado que o passageiro está na cidade "Belo Horizonte" e no endereço "Rua A"
    Quando solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que o passageiro está na cidade "São Paulo" e no endereço "Av Paulista"
    Quando solicitar a reserva de um carro
    Então o sistema deve retornar a mensagem "Área fora de cobertura"