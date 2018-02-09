public class Calculator{

    //результаты вычмсления
    private int result;

    //Суммируем Аргументы
    public void add(int...params){
        for (Integer param : params){
            this.result += param;
        }
    }

    //Получение результата
    public int getResult(){
        return this.result;
    }

    //Очистить рельзат
    public void clearResult(){
        this.result = 0;
    }
}