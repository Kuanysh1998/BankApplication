# BankApplication
Создайте класс Account.java с параметрами:

- int id;

- String name;

- String surname;

- double balance;

 

Геттеры и сеттеры

+ String toString(); //// Данный метод все значения полей

 

Создайте класс BankApplication.java с параметрами:

- String name;

- ArrayList accounts = new ArrayList();

 

+ void addAccount(Account a); // Добавляет новый объект Account

+ void removeAccount(int i); // Удаляет объект со списка под индексом i

+ Account getMaxAccount(); // Возвращает объект Account у кого самый высокий баланс

+ double getAverageBalance(); // Возвращает среднее значение баланса пользователей

+ double getTotalBalance(); // Возвращает сумму баланса пользователей

+ int totalAccounts();  // Возвращает количество пользователей

+ String getBankData(); // Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса

 

В основном классе Main, создайте 3 объекта BankApplication.java, добавьте туда по 10 новых счетов, с разным балансом.

Добавьте все эти банки в массив из банков ArrayList<BankApplication> allBanks;

Выведите данные по каждому банку, отсортировав их по среднему значению баланса, по убыванию.
