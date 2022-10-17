# -*- coding: utf-8 -*-

# Declaração de variáveis e atribuição do valor de input pelo usuário, com conversão para inteiro
base = int(input())
topo = int(input())

# Inicialidação de variável
resultado = 0

# Declaração de variável e atribuição do valor de resultado da expressão matemática
area_nota = 160 * 70
area_corte = float(((base + topo) * 70) / 2)
porcentagem = area_corte / area_nota

# Condicional que testará o valor da variável "porcentagem" e atribuirá valor à variável "resultado"
if porcentagem != 0.5:
    if porcentagem > 0.5:
        resultado = 1
    else:
        resultado = 2
else:
    resultado = 0
    
# Exibição do valor da variável "resultado"
print(resultado)
