/*
 * X1 = V1 * T
 * X2 = 100Km - V2 * T
 * 
 * Como o caminhão tem 2 pedágios como obstáculo e perde 5 minutos em cada um deles, 
 * podemos calcular o tempo de viagem sem os obstáculos:
 *  T = 100km / 80kmh = 1,25h
 * 
 * Porém, como perde 10 minutos (ou 0,17 horas) nos pedágios, o tempo de viagem para o caminhão será de 
 * ]1,25h+0,17h=1,42h. Sua velocidade média é: 100km / 1,42 = 70,6km/h
 * 
 * Nas equações horárias podemos limpar o tempo e igualar ambas 
 * para achar o ponto em que o carro e o caminhão se cruzam:
 * 
 x = (v1*100) / (v1 + v2) = (110 * 100) / (110 + 70,6)
 x = 60,9km
 */