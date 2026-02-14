# 🚚 Calculadora de Frete Rodoviário

Projeto desenvolvido em **Java** com foco em **Programação Orientada a Objetos e arquitetura em camadas**, com o objetivo de auxiliar caminhoneiros e transportadores no cálculo preciso de fretes rodoviários considerando os custos reais da operação.

---

## 📌 Objetivo do Projeto

A Calculadora de Frete Rodoviário foi criada para responder a pergunta mais importante de qualquer transporte:

> “Esse frete realmente compensa?”

O sistema calcula:

- Valor bruto do frete
- Custo com combustível
- Custo com desgaste do veículo
- Valor líquido final da operação

Permitindo ao transportador tomar decisões mais seguras e evitar prejuízos.

---

## ⚙️ Funcionalidades Atuais (v3)

✔ Seleção do tipo de frete utilizando **ENUM**
- 💰 Frete por KM  
- ⚖️ Frete por Tonelada  
- 🚛 Frete por Carga  

✔ Cálculo automático de:

- ⛽ Custo total com combustível
- 🔧 Custo total com desgaste por eixo
- 💵 Valor bruto do frete
- 📉 Valor líquido do frete

✔ Modelagem orientada a objetos com separação de responsabilidades:

- Classe `Frete` → dados do frete
- Classe `Veiculo` → dados do veículo
- Classe `Calculadora` → regras de negócio
- Enum `TipoFrete` → define o tipo do frete
- Classe `Main` → interação com o usuário

✔ Arquitetura organizada em camadas:

- Application
- Model
- Service

✔ Tratamento de erros de entrada do usuário

✔ Projeto estruturado com Maven

---

## 🛠️ Tecnologias Utilizadas

- Java
- Maven
- Git
- GitHub
- IntelliJ IDEA
- Programação Orientada a Objetos (POO)

---

## 📁 Estrutura do Projeto

```
Projeto/
│
└── src/
    │
    └── main/
        │
        └── java/
            │
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
- Organização de projeto com Maven

---

## ▶️ Como Executar

### 1. Clone o repositório

- git clone https://github.com/pedrohen-g/Calculadora-frete-caminhao.git
- 2. Abra no IntelliJ IDEA ou outra IDE Java
- 3. Execute a classe Application/Main.java
- 4. Siga as instruções no terminal
     
 ## 💻 Exemplo de Uso
```md
===========================================================
           🚚 Calculadora de frete Rodoviário 🚚
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
Digite qual o valor do frete por Tonelada: 98
===========================================================
                        RESULTADO                        
===========================================================

💰 Valor bruto do frete:        R$ 3724,00
⛽ Custo total com combustível: R$ 1815,00
🔧 Custo total com desgaste:    R$ 500,50
📉 Custo total da viagem:       R$ 2315,50

💵 Valor líquido do frete:      R$ 1408,50
📊 Margem de lucro:            37,82%
```
---

## 🚀 Evolução do Projeto

v1
Versão inicial com lógica básica

v2
Introdução de Programação Orientada a Objetos

v3 (Atual)
Refatoração completa

- Uso de ENUM

- Separação em camadas

- Arquitetura mais profissional

- Código mais limpo e escalável

---

## 🔮 Próximas Melhorias (Roadmap)

- Interface gráfica (JavaFX)

- Histórico de fretes

- Exportação de relatórios

- Integração com banco de dados

- Simulação de lucro/prejuízo

- Interface visual profissional

---

## 👨‍💻 Autor

Pedro Henrique Gomes Silva  

🎓 Estudante de Engenharia de Computação — 5º período  
💻 Foco em desenvolvimento backend com Java  
🚛 Projeto com aplicação prática no transporte rodoviário  

🔗 LinkedIn:  
https://www.linkedin.com/in/pedro-henrique-gomes-silva-6296452b6/


📄 Licença
Projeto de uso educacional e portfólio.
Livre para estudo, modificação e evolução.
