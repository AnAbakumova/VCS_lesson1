# Автоматизация для отдела продаж.

## Анализ статистики

Существует множество методов анализа продаж - [Топ-10](https://www.esphere.ru/blog/top-10-metodov-analiza-prodazh)

Мы рассматриваем следующий метод:

``` java  
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```