# 🚗 **Sistema de Gestão de Veículos** 🛵

Este projeto implementa um sistema para processar dados de veículos de vários tipos. O sistema gerencia informações sobre **automóveis**, **motocicletas**, **caminhões**, **bicicletas** e **skates**, onde cada tipo de veículo possui atributos específicos.

## 🚙 **Tipos de Veículos**:

1. **Automóveis**: Modelo, ano de fabricação, montadora, cor, kilometragem (odômetro), quantidade de passageiros, tipo de freio e airbag.
2. **Motocicletas**: Modelo, ano de fabricação, cilindradas e torque.
3. **Caminhões**: Modelo, ano de fabricação, quantidade de eixos e peso bruto.
4. **Bicicletas**: Modelo, marca, cor, material, quantidade de marchas e amortecedor.
5. **Skates**: Modelo, marca, cor e tipo das rodas.

## ⚙️ **Funcionalidades do Sistema**:

- **Encapsulamento e Validação**: Todos os atributos dos veículos são encapsulados e, quando necessário, validados.
- **Comando de Inserção no Banco de Dados**: Cada classe de veículo gera um comando SQL para inserir os dados em uma tabela de banco de dados correspondente.
- **Teste das Classes**: Diversos objetos são criados para testar a funcionalidade das classes e seus métodos.

## 💻 **Tecnologias Utilizadas**:

- **Java 17** (ou superior)
- **JDBC** (Java Database Connectivity)
- **MySQL** (Banco de Dados Relacional)

## 📦 **Como Executar o Projeto**:

### Passo 1: Configuração do Banco de Dados

1. **Criar o Banco de Dados**:
   Antes de executar o código, certifique-se de criar o banco de dados `sistemasveiculos` no MySQL com a seguinte consulta SQL:

   ```sql
   CREATE DATABASE sistemasveiculos;

Resultado Aplicação 🖥️
![img](https://github.com/LcasQueirxz/SISTEMA_VEICULOS/blob/master/img/Captura%20de%20Tela%202024-11-28%20%C3%A0s%2019.37.18.png)
![img](https://github.com/LcasQueirxz/SISTEMA_VEICULOS/blob/master/img/Captura%20de%20Tela%202024-11-28%20%C3%A0s%2019.35.30.png)
