class veiculo:
    def __init__(self):
        self.qtd_rodas_carro = 4
        self.qtd_rodas_moto = 4

    def totalRodas(self,entrada):
        if entrada == "c":
            print("tem 4 rodas")
        elif entrada == "m":
            print("tem 2 rodas")
        else:
            print("codigo invalido")


entrada = input("""Qual o tipo de veiculo?
use c para carro e m para moto
""")
v = veiculo()
v.totalRodas(entrada)

