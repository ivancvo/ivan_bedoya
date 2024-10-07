# calcula el imc 

def calcular_IMC(peso: float, altura: float )->float:
    return peso/(altura **2)

# calcula el porcentaje de grasa

def calcular_porcentaje_grasa(edad: int, valor_genero:float) -> float:
    return  (calcular_IMC *1.2) + (0.23 * edad) - (5.4 - valor_genero)


 
#  calcula las calorias en reposo
def calcular_calorias_en_reposo(peso: float, altura: float, edad: int, valor_genero:int)->float:
     return  (10*peso) + (6.25 * altura) - (5* edad) + valor_genero



# calcula las calorias en ctividd fisica

def calcular_calorias_en_actividad(valor_actividad: float)->float:
    return calcular_calorias_en_reposo * valor_actividad



def consumo_calorias_recomendado_para_adelgazar()->str:
    min = calcular_calorias_en_reposo - (calcular_calorias_en_reposo *0.8)
    max=  calcular_calorias_en_reposo - (calcular_calorias_en_reposo *0.85)
    return "Para adelgzar es recomendado que consumas entre"+str(min)+" y" +str(max)+ "calorias al dia. \n Siendo"+str(min)+ " el rango inferior y"+str(max)+ "el rango superior."