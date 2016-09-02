package com.projectapp.lessons._8_Enums_and_Metadada;

/** В Java перечисления
 * определяют тип класса. Благодаря тому что перечисления реализованы
 * в виде классов, само понятие перечисления значительно расширяется. Например,
 * перечисления в Java могут иметь конструкторы, методы и переменные экземпляра
 *
 * В Java такие константы называются самотипизированными
 *
 * Объявив перечисление, можно создавать переменные данного типа.
 * Но, несмотря на то, что перечисления определяют тип класса, получать экземпляры
 * класса типа enum с помощью оператора new нельзя.
 *
 * 1- Перечисление (enum) не могут наследоваться от другого класса
 * 2- Перечисление (enum) не могут быть суперклассом
 */

/*Например можно обьявить дни недели*/
public enum A1_FirsEnums {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THUESDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,

    /* Каждый день явно объявлен как открытый статический конечный
     член класса A1_FirsEnums
     Более того, они относятся к типу того перечисления,
     в котором объявлены в данном примере они имеют тип A1_FirstEnums
    */
}