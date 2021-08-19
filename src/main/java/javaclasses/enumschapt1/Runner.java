package javaclasses.enumschapt1;

public class Runner {
    public static void main(String[] args) {
        MusicType type = MusicType.CLASSIC;
        /*String value = "Rock  ";
        MusicType type1 = MusicType.valueOf(value.toUpperCase().trim());
        String name = type.getRealName();*/
        type.info();
        // Объекты перечисления создаются в единственном экземпляре, поэтому сравнение оператором «==» элементов
        // перечисления приводит к сравнению их объектных ссылок.
        // Нумерация позиций элементов перечисления начинается с нуля.
        // Нельзя наследоваться
        // Не может быть абстрактным (но может содержать абстрактные методы)
        MusicType type2 = MusicType.valueOf("ROCK");
        System.out.println(type.compareTo(type2));
    }
}
