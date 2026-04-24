# 🚚 Calculadora de Frete Rodoviário

Projeto desenvolvido em **Java** com foco em **Programação Orientada a Objetos (POO)** e **arquitetura em camadas**, com o objetivo de auxiliar caminhoneiros e transportadores a analisarem a viabilidade real de um frete.

---

## 📌 Objetivo do Projeto

A Calculadora de Frete Rodoviário foi criada para responder a uma pergunta essencial no transporte:

> **“Esse frete realmente vale a pena?”**

O sistema realiza o cálculo completo da operação, considerando:

- Valor bruto do frete  
- Custo com combustível  
- Custo com desgaste do veículo  
- Valor líquido da viagem  
- Margem de lucro  

Permitindo decisões mais seguras e evitando prejuízos.

---

## ⚙️ Funcionalidades (v3.1)

✔ Seleção do tipo de frete utilizando **ENUM**  
- 💰 Frete por KM  
- ⚖️ Frete por Tonelada  
- 🚛 Frete por Carga  

✔ Cálculos automáticos:

- ⛽ Custo total com combustível  
- 🔧 Custo de desgaste por eixo  
- 💵 Valor bruto do frete  
- 📉 Custo total da operação  
- 📊 Margem de lucro  

✔ Modelagem orientada a objetos com separação de responsabilidades:

- `Frete` → dados do frete  
- `Veiculo` → dados do veículo  
- `Calculadora` → regras de negócio  
- `TipoFrete` → definição do tipo de frete  
- `Main` → interação com o usuário  

✔ Arquitetura em camadas:

- `Application`  
- `Model`  
- `Service`  

✔ Tratamento de erros de entrada  

✔ Projeto estruturado com **Maven**

---

## 🛠️ Tecnologias Utilizadas

- Java  
- Maven  
- Git  
- GitHub  
- IntelliJ IDEA  

---

## 📁 Estrutura do Projeto

```
Projeto/
│
└── src/
    └── main/
        └── java/
            ├── Application/
            │   └── Main.java
            │
            ├── Model/
            │   ├── Frete.java
            │   ├── Veiculo.java
            │   └── TipoFrete.java
            │
            └── Service/
                └── Calculadora.java
```

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos  
- Encapsulamento  
- Separação de responsabilidades  
- Arquitetura em camadas  
- Uso de ENUM  
- Boas práticas de código Java  

---

## ▶️ Como Executar

1. Clone o repositório:
```
git clone https://github.com/pedrohen-g/Calculadora-frete-caminhao.git
```

2. Abra na sua IDE Java (IntelliJ, Eclipse, etc.)  
3. Execute a classe `Application/Main.java`  
4. Siga as instruções no terminal  

---

## 💻 Exemplo de Uso

```
===========================================================
           🚚 Calculadora de Frete Rodoviário 🚚
===========================================================

🚚 INFORME OS DADOS DO VEÍCULO:

Digite a quantidade de eixos do veículo: 7
Digite a média de consumo do veículo (KM/L): 1,8
Digite a capacidade de carga do veículo (TONELADAS): 38

------------------------------------------------------------

📦 INFORME OS DADOS DO FRETE:

Digite o preço do combustível por litro: 5,94
Digite a distância total do frete (KM): 550

Tipo de frete:
1 - Frete por KM
2 - Frete por Tonelada
3 - Frete por Carga

Digite a opção desejada: 2
Digite o valor do frete por tonelada: 98

===========================================================
                        RESULTADO                        
===========================================================

💰 Valor bruto do frete:        R$ 3724,00
⛽ Custo com combustível:       R$ 1815,00
🔧 Custo com desgaste:         R$ 500,50
📉 Custo total da viagem:      R$ 2315,50

💵 Valor líquido do frete:      R$ 1408,50
📊 Margem de lucro:            37,82%
```

---

## 🚀 Evolução do Projeto

**v1**  
Versão inicial com lógica básica  

**v2**  
Aplicação de Programação Orientada a Objetos  

**v3 (Atual)**  
Refatoração completa com foco em arquitetura e organização:

- Uso de ENUM  
- Separação em camadas  
- Código mais limpo e escalável  

---

## 🔮 Roadmap (Próximas Evoluções)

- Interface gráfica  
- Histórico de fretes  
- Exportação de relatórios  
- Integração com banco de dados  
- API REST com Spring Boot  
- Simulação avançada de lucro/prejuízo  

---

## 👨‍💻 Autor

**Pedro Henrique Gomes Silva**  

🎓 Engenharia de Computação — 5º período  
💻 Foco em desenvolvimento backend com Java  
🚛 Projeto com aplicação prática no transporte rodoviário  

🔗 LinkedIn:  
https://www.linkedin.com/in/pedro-henrique-gomes-silva-6296452b6/

---

## 📄 Licença

Projeto com fins educacionais e de portfólio.  
Livre para estudo, modificação e evolução.
