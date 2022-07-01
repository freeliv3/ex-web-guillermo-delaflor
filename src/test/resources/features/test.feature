#language: es

  @testfeature
  Característica: Operaciones básicas
    Yo, como usuario
    Quiero, realizar distintas operaciones en la calculadora
    Para validar el resultado de cada operación


    Escenario: Suma de dos números
      Dado que me encuentro en la página de inicio de TestSheepNZ
      Cuando ingreso dos valores FirstNumber: "10" y SecondNumber: "2"
      Y al dar Operation "Add"
      Entonces valido que el Answer:  "12"

    Escenario: Resta de dos números
      Dado que me encuentro en la página de inicio de TestSheepNZ
      Cuando ingreso dos valores FirstNumber: "10" y SecondNumber: "2"
      Y al dar Operation "Subtract"
      Entonces valido que el Answer:  "8"

    Escenario: Multiplicación de dos números
      Dado que me encuentro en la página de inicio de TestSheepNZ
      Cuando ingreso dos valores FirstNumber: "10" y SecondNumber: "2"
      Y al dar Operation "Multiply"
      Entonces valido que el Answer:  "20"

    Escenario: División de dos números
      Dado que me encuentro en la página de inicio de TestSheepNZ
      Cuando ingreso dos valores FirstNumber: "10" y SecondNumber: "2"
      Y al dar Operation "Divide"
      Entonces valido que el Answer:  "5"

    Escenario: Concatenación de dos números
      Dado que me encuentro en la página de inicio de TestSheepNZ
      Cuando ingreso dos valores FirstNumber: "10" y SecondNumber: "2"
      Y al dar Operation "Concatenate"
      Entonces valido que el Answer:  "102"

    Escenario: Mensaje de error alfanumérico
      Dado que me encuentro en la página de inicio de TestSheepNZ
      Cuando ingreso dos valores FirstNumber: "10a" y SecondNumber: "2"
      Y al dar Operation "Add"
      Entonces valido que el Answer:  "Number 1 is not a number"