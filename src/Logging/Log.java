package Logging;

/**
 * Реализован интерфейс, так как в последствии могут быть расширен функционал: запись в другие форматы файлов или изменена сам формат записи
 */
public interface Log {

    /**
     * Метод записи выражения в файл
     * @param expression - математическое выражение в в иде отформатированной строки
     * @param nameFile - путь к файлу
     */
    public void writeFile(String expression, String nameFile);

    /**
     * Метод получения математического выражения в виде отформатированной строки
     * @param x - первое число
     * @param y - второе число
     * @param result - реузльтат выражения
     * @param operation - математическое действие
     * @return - отформатированная строка
     */
    public String getExpression(Double x, Double y, Double result, Integer operation);
}