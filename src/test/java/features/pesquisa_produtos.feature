#language: pt

Funcionalidade: Buscar por produtos no site da Amazon

  Cenário: Buscando por três produtos

  Esquema do Cenário:
    Dado que o usuario está na tela de pesquisa do Amazon
    Quando pesquisa por <produto>
    Então o titulo da pagina deve ser <tituloObtido>

    Exemplos:
      | produto                          | tituloObtido                                     |
      | "Smartphne Sansung Galaxy A70"   | "Amazon.com.br : Smartphne Sansung Galaxy A70"   |
      | "Smartphone Motorola One Vision" | "Amazon.com.br : Smartphone Motorola One Vision" |
      | "Smartphone Xiaomi Redmi Note 7" | "Amazon.com.br : Smartphone Xiaomi Redmi Note 7" |
